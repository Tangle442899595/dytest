package com.nue;

import com.neu.entity.TbGoods;

public class CartItem {
	private TbGoods good;
	private Integer num;
	private Double total;
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItem(TbGoods good, Integer num, Double total) {
		super();
		this.good = good;
		this.num = num;
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartItem [good=" + good + ", num=" + num + ", total=" + total + "]";
	}
	public TbGoods getGood() {
		return good;
	}
	public void setGood(TbGoods good) {
		this.good = good;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
}
