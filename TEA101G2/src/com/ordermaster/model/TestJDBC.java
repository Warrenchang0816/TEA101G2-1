package com.ordermaster.model;

import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestJDBC {
	public static void main(String[] args) {
	
		OrderMasterDAOInterface dao = new OrderMasterDAO();
		
		//All
//		List<OrderMasterVO> list = dao.selectAll();
//		for(OrderMasterVO orderMasterVO : list) {
//			System.out.println(orderMasterVO.getOrderMasterId());
//		}
		
		//AllByMember
//		OrderMasterService oms = new OrderMasterService();
//		List<OrderMasterVO> list = oms.selectAllOrderMasterByMember("MEM00001");
//		for(OrderMasterVO orderMasterVO : list) {
//			System.out.println(orderMasterVO.getOrderMasterId());
//		}		
		
		//One
//		OrderMasterVO one = dao.selectOne("OMS000001");
//		System.out.println(one.getOrderMasterId());
//		System.out.println(one.getMemberId());
		
		//insert
//		OrderMasterVO add = new OrderMasterVO();
//		add.setMemberId("MEM00001");
//		add.setOrderCreateDate(java.sql.Date.valueOf("2020-09-01"));
//		add.setOrderAmount(0);
//		add.setOrderStatus("N");
//		dao.insert(add);
//		System.out.println("FUCK ME!");
		
		//delete
//		dao.delete("OMS000006");
//		System.out.println("FUCK OFF!");
		
		//update
		OrderMasterVO update = new OrderMasterVO();
		update.setOrderMasterId("OMS000007");
		update.setMemberId("MEM00001");
		update.setOrderCreateDate(java.sql.Date.valueOf("2020-09-01"));
		update.setOrderAmount(880);
		update.setOrderStatus("N");
		dao.update(update);
		System.out.println("FUCKING BOOSHIT");
		
	}

}
