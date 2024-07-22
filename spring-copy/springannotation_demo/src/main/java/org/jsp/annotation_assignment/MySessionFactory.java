package org.jsp.annotation_assignment;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {
	@Autowired
	private List<String> mappingresources;
	@Autowired
	@Qualifier(value = "getProperties")
	private Properties hibernateProperties;
	@Autowired
	private MyDataSource dataSource;

	public List<String> getMappingresources() {
		return mappingresources;
	}

	public void setMappingresources(List<String> mappingresources) {
		this.mappingresources = mappingresources;
	}

	public Properties getHibernateProperties() {
		return hibernateProperties;
	}

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

	public MyDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;
	}

}

