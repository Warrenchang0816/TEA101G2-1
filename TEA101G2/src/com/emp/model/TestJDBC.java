package com.emp.model;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.http.Part;

public class TestJDBC {
	public static void main(String[] args) {
	
		EmpDAOInterface dao = new EmpDAO();
		
//		ByteArrayOutputStream baos = null;
//		try {
////			File file = new File("C:\\Users\\CJ01007\\Desktop\\TEA101G2\\BlobTest1.jpg");
//			File file = new File("C:\\Users\\CJ01007\\Desktop\\TEA101G2\\BlobTest2.jpg");
//			FileInputStream fis = new FileInputStream(file);
//			baos = new ByteArrayOutputStream();
//			byte[] buffer = new byte[8192];
//			int i;
//			while ((i = fis.read(buffer)) != -1) {
//				baos.write(buffer, 0, i);
//			}
//			baos.close();
//			fis.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//All
//		List<EmpVO> list = dao.selectAll();
//		for(EmpVO empVO : list) {
//			System.out.println(empVO.getEmpId());
//			System.out.println(empVO.getEmpName());
//			System.out.println(empVO.getEmpPhoto());
//		}		
//		System.out.println("FUCK");
		
		//One
//		EmpVO one = dao.selectOne("20");
//		System.out.println(one.getEmpId());
//		System.out.println(one.getEmpName());
//		System.out.println(one.getEmpPhoto());
//		System.out.println(one.getEmpPhotoBase64());
//		System.out.println("FUCK");
		
		//login
//		EmpService es = new EmpService();
//		if(es.isEmpLogin("rutruw217d", "eleif74w8")) {
//			System.out.println("FUCKLogin");
//		}else {
//			System.out.println("NOTLogin");
//		}
			
		//login
//		EmpService es = new EmpService();
//		EmpVO emp = es.selectAllEmpByAccount("rutruw217d");
//		System.out.println(emp.getEmpPassword());
		
		//empAccount
//		EmpService es = new EmpService();
//		if(es.isEmpAccountLogin("123213")) {
//			System.out.println("FUCKLogin");
//		}else {
//			System.out.println("NOTLogin");
//		}
		
		//insert
//		EmpVO add = new EmpVO();
//		add.setEmpAccount("EMP_ACCOUNT");
//		add.setEmpPassword("EMP_PASSWORD");
//		add.setEmpName("EMP_NAME");
//		add.setEmpNickname("EMP_NICKNAME");
//		add.setEmpEmail("EMP_EMAIL");
//		add.setEmpPhoto(baos.toByteArray());
//		add.setEmpPhone("EMP_PHONE");
//		add.setEmpAdress("EMP_ADRESS");
//		add.setEmpBirth(java.sql.Date.valueOf("2020-09-01"));
//		add.setEmpSex("M");
//		add.setEmpCountry("EMP_COUNTRY");
//		add.setEmpHireDate(java.sql.Date.valueOf("2020-09-01"));
//		add.setEmpJob("JOB");
//		add.setEmpAuth(2);
//		add.setEmpStatus("Y");
//		dao.insert(add);
//		System.out.println("FUCK");
		
		//delete
//		dao.delete("10");
//		System.out.println("FUCK");
		
		//update
//		EmpVO update = new EmpVO();
//		update.setEmpId("20");
//		update.setEmpAccount("EMP_ACCOUNT");
//		update.setEmpPassword("EMP_PASSWORD");
//		update.setEmpName("EMP_NAME");
//		update.setEmpNickname("EMP_NICKNAME");
//		update.setEmpEmail("EMP_EMAIL");
//		update.setEmpPhoto(baos.toByteArray());
//		update.setEmpPhone("EMP_PHONE");
//		update.setEmpAddress("EMP_ADRESS");
//		update.setEmpBirth(java.sql.Date.valueOf("2020-09-01"));
//		update.setEmpSex("M");
//		update.setEmpCountry("EMP_COUNTRY");
//		update.setEmpHireDate(java.sql.Date.valueOf("2020-09-01"));
//		update.setEmpJob("JOB");
//		update.setEmpAuth(2);
//		update.setEmpStatus("Y");
//		dao.update(update);
//		System.out.println("FUCK");
		
//		TestJDBC test = new TestJDBC();
//		String allname = "A;B;C;D;";
//		String allname2 = "A";
		
//		if(allname.contentEquals("A")) {
//			System.out.println("FUCK");
//		}else {
//			System.out.println("SH\nIT");
//		}
//		if(allname.contains("A;")) {
//			System.out.println("FUCK");
//		}else {
//			System.out.println("SHIT");
//		}
//		
//		if(allname.contains(";")) {
//			String[] nameArray = allname.split(";");
//			for(String namename: nameArray) {
//				System.out.println(namename);
//			}
//		}else {
//			System.out.println(allname2);
//		}
		
//		System.out.println(allname.indexOf(";", 2));
		
		
		
//		Map<String, String> chatNames = new HashMap<String, String>();
//		EmpService es = new EmpService();
//		List<EmpVO> empList = es.selectAllEmp();
//		chatNames = empList.stream().collect(Collectors.toMap(EmpVO::getEmpId, EmpVO::getEmpName));
//		
//		Set<String> key = chatNames.keySet();
//		for(String id: key) {
//			System.out.println(id);
//		}
//		
//		Collection<String> values = chatNames.values();
//		for(String name: values) {
//			System.out.println(name);
//		}
//		
//		Set<Map.Entry<String, String>> entries = chatNames.entrySet();
//		
//		Stream<Map.Entry<String, String>> entriesStream = entries.stream();
//		Stream<String> keyStream = key.stream();
//		Stream<String> valuesStream = values.stream();
		
//		Optional<String> empName = entriesStream.findAny(name -> name.getKey().equals("EMP00006")).map(Map.Entry::getValue).findFirst();
		
//		String empName = entriesStream.filter(name -> name.getKey().equals("EMP00007")).map(Map.Entry::getValue).findFirst().get();
//		System.out.println("FUCK " + empName);
		
//		EmpService es = new EmpService();
//		Set<Map.Entry<String, String>> list = es.selectAllEmpIdName();
//		for(int i = 0; int ) {
//			
//		}
		
//		Map<String, String> list = es.selectAllEmpIdName();
//		for (Map.Entry<String, String> entry : list.entrySet()) {
//		    System.out.println(entry.getKey() + "/" + entry.getValue());
//		}
		
		
		
//		{"type":"history","sender":"EMP00006","receiver":"EMP00007","message":""}
		String message =" {type:history,sender:EMP00006,receiver:EMP00007,message:}";
		String[] messages = message.split(",");
		System.out.println(messages[0]);
		String type = messages[0].substring(messages[0].lastIndexOf(":"), messages[0].length());
		System.out.println("type:"+type);
//		String typename = message.substring(message.lastIndexOf("=") + 2, header.length() - 1);
		
	}
	
	

}
