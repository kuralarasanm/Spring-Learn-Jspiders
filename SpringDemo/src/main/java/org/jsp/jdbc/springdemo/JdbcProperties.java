package org.jsp.jdbc.springdemo;

public class JdbcProperties {
private String driver;
private String url;
private String user;
private String password;
public JdbcProperties() {
	
}
public JdbcProperties(String driver, String url, String user, String password) {
	this.driver = driver;
	this.url = url;
	this.user = user;
	this.password = password;
}
public void displayproperties() {
	System.out.println("driver"+driver);
	System.out.println("url"+url);
	System.out.println("user"+user);
	System.out.println("password"+password);
	System.out.println("----------------------------------------");
}
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}