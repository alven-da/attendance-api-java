package com.attendance.repository;

import org.springframework.stereotype.Component;

import com.attendance.domain.Member;

@Component
public interface IMemberRepository {
	boolean saveAll(Member[] members);
	boolean save(Member member);
	Member getMemberById(String id);
	
	// search member by first name, last name or member ID
	Member getMemberByKeyword(String keyword);
}
