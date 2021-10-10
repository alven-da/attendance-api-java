package com.attendance.application.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.attendance.application.IUseCase;
import com.attendance.application.impl.dto.BatchSaveMemberInformationInputDto;
import com.attendance.application.impl.dto.BatchSaveMemberInformationOutputDto;
import com.attendance.domain.Member;
import com.attendance.repository.IMemberRepository;

@Component
public class BatchSaveMemberInformationUseCase
	implements IUseCase<BatchSaveMemberInformationInputDto[], BatchSaveMemberInformationOutputDto> {

	private IMemberRepository memberRepo;
	
	public BatchSaveMemberInformationUseCase(IMemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}
	
	public BatchSaveMemberInformationOutputDto execute(BatchSaveMemberInformationInputDto[] inputs) {
		// TODO Auto-generated method stub
		ArrayList<Member> memberList = new ArrayList<Member>();

		for (BatchSaveMemberInformationInputDto input: inputs) {
			Member member = new Member();
			
			member.setFirstName(input.getFirstName());
			member.setLastName(input.getLastName());
			member.setGroup(input.getGroup());
			member.setMemberId(input.getMemberId());
			
			memberList.add(member);
		}

		Member[] members = memberList.toArray(new Member[memberList.size()]);

		boolean isSaved = this.memberRepo.saveAll(members);

		BatchSaveMemberInformationOutputDto output = new BatchSaveMemberInformationOutputDto();

		output.setSuccess(isSaved);

		return output;
	}
}
