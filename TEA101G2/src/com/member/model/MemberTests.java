package com.member.model;

import java.util.List;

public class MemberTests {
	public static void main(String[] args) {
		MemberDAO_interface dao = new MemberDAO();
//		
//		MemberVO memberVO = dao.findByPrimaryKey("MEM00007");
//		String defaultPassword = memberVO.getMemberPassword();
//		System.out.println(defaultPassword);

//		List<MemberVO> list = dao.getAll();
//		for(MemberVO mc : list) {
//			System.out.println(mc.getMemberAccount());
//			System.out.println("----------------------------");
//		}
		MemberVO memberVO = dao.findByAccount("test001");
		System.out.println(memberVO.getMemberName());
	}
}
