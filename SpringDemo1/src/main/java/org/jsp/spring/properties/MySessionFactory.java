package org.jsp.spring.properties;

import java.util.Properties;

public class MySessionFactory {
	private MyDataSource datasource;
	private Properties hibernateproperties;
	private String[] mappingresources;

	public MyDataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(MyDataSource datasource) {
		this.datasource = datasource;
	}

	public Properties getHibernateproperties() {
		return hibernateproperties;
	}

	public void setHibernateproperties(Properties hibernateproperties) {
		this.hibernateproperties = hibernateproperties;
	}

	public String[] getMappingresources() {
		return mappingresources;
	}

	public void setMappingresources(String[] mappingresources) {
		this.mappingresources = mappingresources;
	}

}
