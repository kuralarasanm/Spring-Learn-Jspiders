package org.jsp.annotation_assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	@Value(value = "jdbc:mysql://localhost:3306/spring_prc")
	private String url;
	@Value(value = "root")
	private String username;
	@Value(value = "com.mysql.cj.jdbc.driver")
	private String DriverClass;
	@Value(value = "admin")
	private String password;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDriverClass() {
		return DriverClass;
	}

	public void setDriverClass(String driverClass) {
		DriverClass = driverClass;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
