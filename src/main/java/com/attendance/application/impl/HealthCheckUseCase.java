package com.attendance.application.impl;

import com.attendance.application.IUseCase;

public class HealthCheckUseCase implements IUseCase<Integer, String> {
	public String execute(Integer input) {
		return "ok";
	}

}
