package org.jsp.hibernatetemplatedemo.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.hibernatetemplatedemo.dao.ProductDao;
import org.jsp.hibernatetemplatedemp.dto.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class Test {
	static ProductDao dao;
	static Scanner s=new Scanner(System.in);
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("product-cfg.xml");
		dao = context.getBean(ProductDao.class);
	}

	public static void main(String[] args) {
		System.out.println(dao);
		System.out.println("PRODUCT DETAILS");
		System.out.println("1.save product");
		System.out.println("2.update product");
		System.out.println("3.find product by id");
		System.out.println("4.Delete product");
		System.out.println("5.Find All Products");
		switch (s.nextInt()) {
		case 1:{
			save();
			break;
		}
		case 2:{
			update();
			break;
		}
		case 3:{
			findbyid();
			break;
		}
		case 4:{
			delete();
			break;
		}
		case 5:{
			findAll();
			break;
		}
		default:{System.out.println("invalid option");
		}
		}
	}

	public static void save() {
		System.out.println("enter the name ,brand,category,,cost,description 1 to save");
		Product p = new Product();
		p.setName(s.next());
		p.setBrand(s.next());
		p.setCategory(s.next());
		p.setCost(s.nextDouble());
		p.setDescription(s.next());
		p = dao.saveProduct(p);
		System.out.println("product saved with id " + p.getId());

	}

	public static void update() {
		System.out.println("enter the name ,brand,category,,cost,description to update");
		Product p = new Product();
		p.setId(s.nextInt());
		p.setName(s.next());
		p.setBrand(s.next());
		p.setCategory(s.next());
		p.setCost(s.nextDouble());
		p.setDescription(s.next());
		p = dao.updateProduct(p);
		if (p != null) {
			System.out.println("product updated with id "+p.getId());
		}
		else {
			System.out.println("invalid product id");
		}
	}
	public static void findbyid() {
		System.out.println("enter id to find");
		int id=s.nextInt();
		Product p=dao.findbyId(id);
		if(p!=null) {
			System.out.println("product id:"+p.getId());
			System.out.println("product name:"+p.getName());
			System.out.println("product brand:"+p.getBrand());
			System.out.println("product category:"+p.getCategory());
			System.out.println("product description:"+p.getDescription());
			System.out.println("product cost:"+p.getCost());
			}
		else {
			System.out.println("invalid product id");
		}
		}
	public static void delete() {
		System.out.println("enter the id to delete product");
		int id=s.nextInt();
		boolean deleted=dao.deleteproduct(id);
		if(deleted) {
			System.out.println("product deleted"); 
		}
		else {
			System.out.println("product not deleted"); 
		}
		}
		public static void findAll() {
			List<Product> products=dao.findAll();
			for(Product p:products) {
				System.out.println("product id:"+p.getId());
				System.out.println("product name:"+p.getName());
				System.out.println("product brand:"+p.getBrand());
				System.out.println("product category:"+p.getCategory());
				System.out.println("product description:"+p.getDescription());
				System.out.println("product cost:"+p.getCost());
				System.out.println("---------------------------------------------");
			}
		}
		}

		


