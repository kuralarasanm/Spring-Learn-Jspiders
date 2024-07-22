package org.jsp.springdi.dto;

public class Gpay {
	private Bank bank;
	public Gpay() {
		
	}
	public Gpay(Bank bank) {
		this .bank=bank;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
