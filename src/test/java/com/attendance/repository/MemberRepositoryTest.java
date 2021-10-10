package com.attendance.repository;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.attendance.common.AttendanceApplicationContext;
import com.attendance.domain.Member;

public class MemberRepositoryTest {

	private IMemberRepository memberRepo;
	
	private Member initializeMember() {
		Member testMember = new Member();
		
		testMember.setFirstName("Alven");
		testMember.setLastName("Alinan");
		testMember.setGroup("Saturday");
		testMember.setMemberId("12109882");
		
		return testMember;
	}

	@Test
	public void testGetMemberByID() {
		
		this.memberRepo = (IMemberRepository) AttendanceApplicationContext.getInstance()
				.getBean("memberMockRepo");

		Member member = memberRepo.getMemberById("11111");
		assertEquals("Alven", member.getFirstName());
	}
	
	@Test
	public void testGetMemberByKeyword() {
		
		this.memberRepo = (IMemberRepository) AttendanceApplicationContext.getInstance()
				.getBean("memberMockRepo");

		Member member = memberRepo.getMemberByKeyword("keyword");
		assertEquals("Alven", member.getFirstName());
	}
	
	@Test
	public void testSaveSingleMember() {
		this.memberRepo = (IMemberRepository) AttendanceApplicationContext.getInstance()
				.getBean("memberMockRepo");
		
		Member member = this.initializeMember();
		
		boolean isSaved = this.memberRepo.save(member);
		
		assertEquals(true, isSaved);
	}
	
	@Test
	public void testSaveBatchMembers() {
		this.memberRepo = (IMemberRepository) AttendanceApplicationContext.getInstance()
				.getBean("memberMockRepo");
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(this.initializeMember());
		members.add(this.initializeMember());
		
		boolean isSaved = this.memberRepo.saveAll(members.toArray(new Member[members.size()]));
		
		assertEquals(true, isSaved);
	}
}
