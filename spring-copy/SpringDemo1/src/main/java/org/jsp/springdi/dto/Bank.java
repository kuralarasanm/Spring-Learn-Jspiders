package org.jsp.springdi.dto;

public class Bank {
	private double balance;
	public void balance() {
		System.out.println("available balance is:"+balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
