package com.orderdetail.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestJDBC {
	public static void main(String[] args) {
	
		OrderDetailDAOInterface dao = new OrderDetailDAO();
		
		//All
//		List<OrderDetailVO> list = dao.selectAll();
//		for(OrderDetailVO orderDetailVO : list) {
//			System.out.println(orderDetailVO.getOrderDetailId());
//		}		
		
		//AllBySpaceDetail
		OrderDetailService ods = new OrderDetailService();
		List<OrderDetailVO> list = ods.selectAllOrderDetailBySD("SD00002");
		for(OrderDetailVO orderDetailVO : list) {
			System.out.println(orderDetailVO.getRentEndTime());
		}		
		
		//One
//		OrderDetailVO one = dao.selectOne("OD0000001");
//		System.out.println(one.getOrderMasterId());
		
		//insert
		OrderDetailVO add = new OrderDetailVO();
		add.setOrderMasterId("OMS000010");
		add.setSpaceDetailId("SD00004");
		add.setRentStartTime(java.sql.Timestamp.valueOf("2020-10-07 07:00:00.0"));
		add.setRentEndTime(java.sql.Timestamp.valueOf("2020-10-07 09:00:00.0"));
		
		//add new order
		java.sql.Date spaceDate = java.sql.Date.valueOf("2020-09-21");
		long spaceStartTime = java.sql.Timestamp.valueOf("2020-09-21 02:00:00.0").getTime();
		long spaceEndTime = java.sql.Timestamp.valueOf("2020-09-23 23:00:00.0").getTime();
				
		java.sql.Date oldOrderDate1 = java.sql.Date.valueOf("2020-09-21");
		long oldOrderStartTime1 = java.sql.Timestamp.valueOf("2020-09-21 23:00:00.0").getTime();
		long oldOrderEndTime1 = java.sql.Timestamp.valueOf("2020-09-22 03:00:00.0").getTime();
				
		java.sql.Date oldOrderDate2 = java.sql.Date.valueOf("2020-09-22");
		long oldOrderStartTime2 = java.sql.Timestamp.valueOf("2020-09-22 07:00:00.0").getTime();
		long oldOrderEndTime2 = java.sql.Timestamp.valueOf("2020-09-22 21:00:00.0").getTime();
				
		java.sql.Date oldOrderDate3 = java.sql.Date.valueOf("2020-09-23");
		long oldOrderStartTime3 = java.sql.Timestamp.valueOf("2020-09-23 02:00:00.0").getTime();
		long oldOrderEndTime3 = java.sql.Timestamp.valueOf("2020-09-23 07:00:00.0").getTime();
				
		java.sql.Date oldOrderDate4 = java.sql.Date.valueOf("2020-09-23");
		long oldOrderStartTime4 = java.sql.Timestamp.valueOf("2020-09-23 09:00:00.0").getTime();
		long oldOrderEndTime4 = java.sql.Timestamp.valueOf("2020-09-23 15:00:00.0").getTime();
				
		java.sql.Date newOrderDate = java.sql.Date.valueOf("2020-09-22");
		long newOrderStartTime = java.sql.Timestamp.valueOf("2020-09-22 01:00:00.0").getTime();
		long newOrderEndTime = java.sql.Timestamp.valueOf("2020-09-22 07:00:00.0").getTime();
		System.out.println(newOrderStartTime);
		System.out.println(newOrderEndTime);		
		//檢查訂單日期：不可小於零
		int compareSpaceDate = (spaceDate.compareTo(newOrderDate)); 
		if(compareSpaceDate < 0) System.out.println(compareSpaceDate + "，輸出不可小於零");
		//檢查訂單時間：必須大於零
		long newOrderTime = (newOrderEndTime-newOrderStartTime);
		if(newOrderTime <= 0) System.out.println(newOrderTime + "，輸出必須大於零");
		//檢查租借總時間/場地開放總時間：不可小於零
		long compareSpaceTime = (spaceEndTime-spaceStartTime)-(newOrderEndTime-newOrderStartTime);
		if(compareSpaceTime < 0) System.out.println(compareSpaceTime + "，輸出不可小於零");
		//檢查租借開始及結束時間：不可位於已被預定時間段
		long compareNewStartTime = (newOrderStartTime-spaceStartTime);
		long compareNewEndTime = (newOrderEndTime-spaceStartTime);
		long compareOldStartTime1 = (oldOrderStartTime1-spaceStartTime);
		long compareOldStartTime2 = (oldOrderStartTime2-spaceStartTime);
		long compareOldStartTime3 = (oldOrderStartTime3-spaceStartTime);
		long compareOldStartTime4 = (oldOrderStartTime4-spaceStartTime);
		long compareOldEndTime1 = (oldOrderEndTime1-spaceStartTime);
		long compareOldEndTime2 = (oldOrderEndTime2-spaceStartTime);
		long compareOldEndTime3 = (oldOrderEndTime3-spaceStartTime);
		long compareOldEndTime4 = (oldOrderEndTime4-spaceStartTime);
				
		long[] starttime = {compareOldStartTime1, compareOldStartTime2, compareOldStartTime3, compareOldStartTime4};
		long[] endtime = {compareOldEndTime1, compareOldEndTime2, compareOldEndTime3, compareOldEndTime4};
				
		for(int i = 0; i < starttime.length; i++) {
			if((compareNewStartTime >= starttime[i]) && compareNewStartTime < endtime[i]) {
				System.out.println("請確認訂單開始時間");
				return;
			}
			if((compareNewEndTime > starttime[i]) && compareNewEndTime <= endtime[i]) {
				System.out.println("請確認訂單結束時間");
				return;
			}
			System.out.println("繼續建立訂單");
		}
//				
//		dao.insert(add);
//		System.out.println("滑進去");
		
		//delete
//		dao.delete("OD0000014");
//		System.out.println("FUCK");
		
		//update
//		OrderDetailVO update = new OrderDetailVO();
//		update.setOrderDetailId("OD0000004");
//		update.setOrderMasterId("OMS000009");
//		update.setSpaceDetailId("SD00003");
//		update.setRentStartTime(java.sql.Timestamp.valueOf("2020-10-06 07:00:00.0"));
//		update.setRentEndTime(java.sql.Timestamp.valueOf("2020-10-06 09:00:00.0"));
//		dao.update(update);
//		System.out.println("更新滑");
		
//		Date date = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
//		String dateString = formatter.format(date);
//		System.out.println(dateString);
//		try {
//			Date today = formatter.parse(dateString);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
	}

}