package datarace;

import annotation.ThreadSafe;

@ThreadSafe
public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
