package com.neu;

public class DVD {
	private String name;
	private String state;
	private String data;
	private int time;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public DVD(String name, String state, String data, int time) {
		super();
		this.name = name;
		this.state = state;
		this.data = data;
		this.time = time;
	}
	
	
}
