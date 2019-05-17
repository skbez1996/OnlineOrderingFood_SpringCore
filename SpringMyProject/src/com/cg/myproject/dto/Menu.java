/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the Menu class which contains a list of items 
*/
package com.cg.myproject.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Menu {
	private String menuName;
	
	private List <Item> itemName  ;
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Menu(String menuName, List<Item> itemName) {
		super();
		this.menuName = menuName;
	
		this.itemName = itemName;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	public List<Item> getItemName() {
		return itemName;
	}
	public void setItemName(List<Item> itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", itemName=" + itemName + "]";
	}
	
	

	
	
	
	

}
