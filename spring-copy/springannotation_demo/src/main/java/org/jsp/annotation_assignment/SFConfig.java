package org.jsp.annotation_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"org.jsp.annotation_assignment"})
public class SFConfig {
	@Bean
	public List<String>getList(){
		List<String> mappingresources =new ArrayList<String>();
		mappingresources.add("user.hbm.xml");
		mappingresources.add("employee.hbm.xml");
		return mappingresources;
	}
	@Bean
	public Properties getProperties() {
		Properties p=new Properties();
		p.setProperty("hbm", "update");
		p.setProperty("dialect", "dialect");
		p.setProperty("show_sql", "true");
		p.setProperty("format_sql", "true");
		return p;
	}
}