/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item class where item's properties are specified
*/
package com.cg.myproject.dto;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
@Component
public class Item {
	private String name;

	private double price;
	
	private String description;

	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Item(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
	

}
