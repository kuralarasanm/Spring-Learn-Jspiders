package org.jsp.springdi.autowiring;

public class Ride {
	private Vehicle v;
	public Ride() {
		
	}
	public Ride(Vehicle v) {
		System.out.println("Ride(vechile)");
		this.v=v;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	
}
