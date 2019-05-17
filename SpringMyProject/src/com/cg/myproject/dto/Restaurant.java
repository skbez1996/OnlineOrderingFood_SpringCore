/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item class where item's properties are specified
*/
package com.cg.myproject.dto;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Restaurant {
	
	private String name;
	private	BigInteger phone;
	private String address;
	
	private Menu menu;

	public Restaurant() {
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	public Restaurant(String name, BigInteger phone, String address, Menu menu) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.menu = menu;
	}
}
