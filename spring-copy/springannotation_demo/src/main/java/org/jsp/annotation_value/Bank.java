package org.jsp.annotation_value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Value(value = "abc")
	private String acc_holder_name;
	private String bank_name;
	private double balance;

	public Bank(@Value(value = "1000") double balance) {
		this.balance = balance;
	}

	@Value(value = "SBI")
	public void setBankname(String bankname) {
		this.bank_name = bankname;
	}

	public String getAcc_holder_name() {
		return acc_holder_name;
	}

	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
