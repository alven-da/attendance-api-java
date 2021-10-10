package com.attendance.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.attendance.application.IUseCase;
import com.attendance.application.impl.dto.GetAttendanceInputDto;
import com.attendance.application.impl.dto.GetAttendanceOutputDto;
import com.attendance.common.AttendanceApplicationContext;
import com.attendance.domain.Member;
import com.attendance.repository.IMemberRepository;

@Component
public class GetAttendanceUseCase implements IUseCase<GetAttendanceInputDto, GetAttendanceOutputDto> {
	
	@Autowired
	private IMemberRepository memberRepo;
	
	public void setMemberRepo(IMemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}

	public GetAttendanceOutputDto execute(GetAttendanceInputDto input) {
		// TODO Auto-generated method stub
		String keyword = input.getKeyword();
		
		Member member = this.memberRepo.getMemberByKeyword(keyword);
		
		GetAttendanceOutputDto outputDto = new GetAttendanceOutputDto();
		
		outputDto.setFirstName(member.getFirstName());
		outputDto.setLastName(member.getLastName());
		outputDto.setMemberId(member.getMemberId());
		outputDto.setGroup(member.getGroup());

		return outputDto;
	}
}
