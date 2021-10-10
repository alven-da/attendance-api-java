package com.attendance.application.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.attendance.application.impl.dto.BatchSaveMemberInformationInputDto;
import com.attendance.application.impl.dto.BatchSaveMemberInformationOutputDto;
import com.attendance.common.AttendanceApplicationContext;

public class BatchSaveMemberInformationUseCaseTest {

	@Test
	public void testSavingBatchMembers() {
		BatchSaveMemberInformationUseCase useCase = (BatchSaveMemberInformationUseCase)
			AttendanceApplicationContext.getInstance().getBean("feedMembersInfoUseCaseMock");
		
		ArrayList<BatchSaveMemberInformationInputDto> list = new ArrayList<BatchSaveMemberInformationInputDto>();
		
		BatchSaveMemberInformationInputDto input1 = new BatchSaveMemberInformationInputDto();
		
		input1.setFirstName("Alven");
		input1.setLastName("Alinan");
		input1.setGroup("12");
		input1.setMemberId("123456789");
		
		BatchSaveMemberInformationInputDto input2 = new BatchSaveMemberInformationInputDto();
		
		input2.setFirstName("Rolly");
		input2.setLastName("Nocedos");
		input2.setGroup("10");
		input2.setMemberId("123456239");
		
		list.add(input1);
		list.add(input2);
		
		BatchSaveMemberInformationOutputDto response = useCase.execute(list.toArray(new BatchSaveMemberInformationInputDto[list.size()]));
		
		assertEquals(true, response.isSuccess());
	}

}
