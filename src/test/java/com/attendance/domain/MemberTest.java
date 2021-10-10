package com.attendance.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberTest {

	@Test
	public void testSetMember() {
		Member testMember = new Member();
		
		testMember.setFirstName("Alven");
		testMember.setLastName("Alinan");
		testMember.setGroup("Saturday");
		testMember.setMemberId("12109882");
		
		assertEquals("Alven", testMember.getFirstName());
		assertEquals("Alinan", testMember.getLastName());
		assertEquals("Saturday", testMember.getGroup());
		assertEquals("12109882", testMember.getMemberId());
	}
}
