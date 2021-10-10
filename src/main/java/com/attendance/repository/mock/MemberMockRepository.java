package com.attendance.repository.mock;

import com.attendance.domain.Member;
import com.attendance.repository.IMemberRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberMockRepository implements IMemberRepository {

	private Member generateMemberObject() {
		Member testMember = new Member();
		
		testMember.setFirstName("Alven");
		testMember.setLastName("Alinan");
		testMember.setGroup("Saturday");
		testMember.setMemberId("12109882");
		
		return testMember;
	}
	
	public boolean saveAll(Member[] members) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean save(Member member) {
		// TODO Auto-generated method stub
		return true;
	}

	public Member getMemberById(String id) {
		return this.generateMemberObject();
	}

	public Member getMemberByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return this.generateMemberObject();
	}

}
