package com.neu.entity;

public class TbGoods {
	private String id; 
	private String name;
	private Double price;
	private String company;
	private String leaveDate;
	private String desc;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "tbGoods [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + ", leaveDate="
				+ leaveDate + ", desc=" + desc + "]";
	}
	public TbGoods(String id, String name, Double price, String company, String leaveDate, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.company = company;
		this.leaveDate = leaveDate;
		this.desc = desc;
	}
	public TbGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

}	
