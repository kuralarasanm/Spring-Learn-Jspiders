package org.jsp.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveUser {
	public static void main(String[] args) {
		String inqry="insert into user values(2,'abc',1234,'asdf123')";
		ApplicationContext context=new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		int r=template.update(inqry);
		System.out.println(r+"rows inserted");
	}
}
