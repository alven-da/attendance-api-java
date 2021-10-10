package com.attendance.application.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.attendance.application.impl.dto.GetAttendanceInputDto;
import com.attendance.application.impl.dto.GetAttendanceOutputDto;
import com.attendance.common.AttendanceApplicationContext;

public class GetAttendanceUseCaseTest {

	@Test
	public void testGetAttendanceUseCase() {
		GetAttendanceUseCase useCase = (GetAttendanceUseCase) AttendanceApplicationContext.getInstance()
			.getBean("getAttendanceUseCaseMock");

		GetAttendanceInputDto inputDto = new GetAttendanceInputDto();
		inputDto.setKeyword("Alinan");

		GetAttendanceOutputDto output = useCase.execute(inputDto);

		assertEquals("Alven", output.getFirstName());
	}

}
