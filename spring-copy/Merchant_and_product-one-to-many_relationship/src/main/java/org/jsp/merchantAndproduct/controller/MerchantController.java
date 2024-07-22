package org.jsp.merchantAndproduct.controller;


import java.util.Scanner;

import org.jsp.merchantAndproduct.MerchantAndProductConfig;
import org.jsp.merchantAndproduct.dao.Merchantdao;
import org.jsp.merchantAndproduct.dto.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MerchantController {
	static Merchantdao dao;
	static Scanner s = new Scanner(System.in);
	static {
		ApplicationContext context = new AnnotationConfigApplicationContext(MerchantAndProductConfig.class);
		dao = context.getBean(Merchantdao.class);
	}
	
	public static void main(String[] args) {
		System.out.println("1.save Merchant");
		System.out.println("2.Update Merchant");
		System.out.println("3.Find Merchant by id");
		System.out.println("4.Verify Merchant by phone and password");
		System.out.println("5.Verify Merchant by email and password");
		System.out.println("6.Verify Merchant by Id and password");
	
		switch (s.nextInt()) {
		case 1: {
			save();
			break;
		}
		case 2: {
			update();
			break;
		}
		case 3: {
			findById();
			break;
		}
		case 4: {
			verifyByPhone();
			break;
		}
		case 5: {
			verifyByEmail();
			break;
		}
		case 6: {
			verifyById();
			break;
		}
		
		default: {
			System.err.println("Invalid Choice");
		}
		}
	}
	
	public static void save() {
		System.out.println("Enter the name,phone,emailand password to register");
		Merchant m = new Merchant();
		Merchant m1 = new Merchant();
		m.setName(s.next());
		m.setPhone(s.nextLong());
		m.setEmail(s.next());
		m.setPassword(s.next());
		m1= dao.saveMerchant(m);
		System.out.println("Employee saved with Id:" + m.getId());
	}
	
	public static void update() {
		System.out.println("Enter the Employee Id to update");
		int mid = s.nextInt();
		System.out.println("Enter the name,phone,emailand password to Update");
		Merchant m = new Merchant();
		m.setId(mid);
		m.setName(s.next());
		m.setPhone(s.nextLong());
		m.setEmail(s.next());
		
		m.setPassword(s.next());
		m = dao.updateEmployee(m);
		if (m != null)
			System.out.println("Employee  with Id:" + m.getId() + " Updated");
		else
			System.err.println("Cannot Update Employee as entered Id is invalid");
	}
	
	public static void findById() {
		System.out.println("Enter the Employee Id to display details");
		int mid = s.nextInt();
		Merchant m = dao.findById(mid);
		if (m != null) {
			System.out.println("Employee Id:" + m.getId());
			System.out.println("Employee Name:" + m.getName());
			
			System.out.println("Phone Number:" + m.getPhone());
			System.out.println("Email Id:" + m.getEmail());
			
		} else {
			System.err.println("You have entered an Invalid Employee Id");
		}
	}
	
	public static void verifyByPhone() {
		System.out.println("Enter Your Phone Number and password to verify");
		long phone = s.nextLong();
		String password = s.next();
		Merchant m = dao.verifyMerchant(phone, password);
		if (m != null) {
			System.out.println("verification succesfull");
			System.out.println("Employee Id:" + m.getId());
			System.out.println("Employee Name:" + m.getName());
			System.out.println("Phone Number:" + m.getPhone());
			System.out.println("Email Id:" + m.getEmail());
			
		} else {
			System.err.println("Invalid Phone Number or Password");
		}
	}
	
	public static void verifyByEmail() {
		System.out.println("Enter Your Email Id and password to verify");
		String email = s.next();
		String password = s.next();
		Merchant m = dao.verifyMerchant(email, password);
		if (m != null) {
			System.out.println("verification succesfull");
			System.out.println("Employee Id:" + m.getId());
			System.out.println("Employee Name:" + m.getName());
			
			System.out.println("Phone Number:" + m.getPhone());
			System.out.println("Email Id:" + m.getEmail());
			
		} else {
			System.err.println("Invalid Email Id or password");
		}
	}

	public static void verifyById() {
		System.out.println("Enter Your Employee Id and password to verify");
		int id = s.nextInt();
		String password = s.next();
		Merchant m = dao.verifyMerchant(id, password);
		if (m != null) {
			System.out.println("verification succesfull");
			System.out.println("Employee Id:" + m.getId());
			System.out.println("Employee Name:" + m.getName());
			
			System.out.println("Phone Number:" + m.getPhone());
			System.out.println("Email Id:" + m.getEmail());
			
		} else {
			System.err.println("Invalid Employee Id or password");
		}
	}
}


