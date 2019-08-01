package com.neu.java9;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test11 {

	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		
		list.add(new Account(10d, "1234"));
		list.add(new Account(15d, "5678"));
		list.add(new Account(0d, "1010"));
		
		Map<Long, Account> map = new HashMap<>();
		
		for(Account a : list) {
			map.put(a.getId(), a);
		}
		
		Set<Entry<Long, Account>> entrySet = map.entrySet();
		
		for(Entry<Long, Account> entry : entrySet) {
			Account account = entry.getValue();
			System.out.println("id:"+account.getId()+",balance:"+account.getBalance());
		}

	}

}



class Account{
	Date date = new Date();
	private long id ;
	private double balance;
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account(double balance, String password) {
		super();
		this.id = (long) (date.getTime()+Math.random()*100);
		this.balance = balance;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [date=" + date + ", id=" + id + ", balance=" + balance + ", password=" + password + "]";
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}