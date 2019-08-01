package com.neu;

public class Cuisine {
	private String name;
	private int prise;
	private int amount;
	public Cuisine(String name, int prise, int amount) {
		super();
		this.name = name;
		this.prise = prise;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Cuisine [name=" + name + ", prise=" + prise + ", amount=" + amount + "]";
	}
	
}
