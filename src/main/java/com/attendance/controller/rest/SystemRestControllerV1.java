package com.attendance.controller.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.attendance.application.impl.HealthCheckUseCase;

@RestController
@RequestMapping("/api/v1/system")
public class SystemRestControllerV1 {
	
	@RequestMapping(value = "/health", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String healthCheck(HttpServletRequest request) {
		HealthCheckUseCase useCase = new HealthCheckUseCase();
		return useCase.execute(0);
	}
}
