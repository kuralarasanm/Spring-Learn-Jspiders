package org.jsp.annotation_beanandconfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"org.jsp.annotation_beanandconfiguration"})
public class Myconfig {
	@Bean
	@Primary
	public List<String>getList(){
		return new ArrayList<String>(Arrays.asList("abc","idn","usnd"));
	}
	@Bean
	public List<String>get2ndList(){
		return new ArrayList<String>(Arrays.asList("orange","apple","grapes"));
	}
}
