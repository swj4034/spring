package com.mycom.samconfig.Domain;

public class samconfigVO {
	private String name;
	private int price;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public samconfigVO() {
		super();
	}
	public samconfigVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
