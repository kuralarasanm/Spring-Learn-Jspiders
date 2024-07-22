package org.jsp.hibernatetemplate.controller;

import java.util.Scanner;

import org.jsp.hibernatetemplate.dao.Productdao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductController {
	static Productdao dao;
	static Scanner s=new Scanner(System.in);
	static {
		ApplicationContext context= new ClassPathXmlApplicationContext("product-cfg.xml");
		dao=context.getBean(Productdao.class);
		
	}
	public static void main(String[] args) {
		System.out.println("enter 1 to save product");
		System.out.println("enter 2 to update product");
		System.out.println("enter 3 to findbyid ");
		System.out.println("enter 4 to findall");
		System.out.println("enter 5 to delete product");
		
		switch (s.nextInt()) {
		case 1:
			
			break;

		default:
			break;
		}
		
		
	}
}
