/**

@author saibezaw(176260)
 * @params sdfjkl
* Project Name : Online Food Ordering System
*MyApplication
* This is the main class where where the user can Add, View and search Restaurants 
* 
* 
* 
* 
*/
package com.cg.myproject.ui;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.cg.myproject.config.JavaConfig;
import com.cg.myproject.dto.Item;
import com.cg.myproject.dto.Menu;
import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;
import com.cg.myproject.service.MenuService;
import com.cg.myproject.service.MenuServiceImpl;

import co.cg.myproject.DBUtil.DBUtil;
@Component
public class MyApplication {
	 static MenuService menuservice;
	
	@Autowired
	MenuService serve;
	
	
	
	@PostConstruct
	public void init() {
		menuservice= this.serve;
		
	}
	
public static void main(String args[]) {
AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
Scanner sc= new Scanner (System.in);
	
	
	
		int choice;
	do {
		System.out.println(" 1.Add Restaurants \n 2.Show Restaurants \n 3.Search Restaurant by name \n 4 .Exit");
    choice= sc.nextInt();
	switch (choice) {
	case 1: 
		
		List <Item> itemList = new ArrayList<>();
		
		
		System.out.println("enter restaurant name");
		String rname = sc.next();
		System.out.println("enter restaurant phone number");
		String rmobile = sc.next();
		System.out.println("enter restaurant city");
		String rcity = sc.next();
		
		
		
		System.out.println("enter menu name");
		String menuName = sc.next();
		
		String ch ;
		
		do {
		System.out.println("enter item name");
		String itemName= sc.next();
		
		System.out.println("enter item price");
		double itemPrice = sc.nextDouble();
		
		System.out.println("enter item description");
		String description = sc.next();
		
		Item item =app.getBean(Item.class);
		
		item.setName(itemName);
		item.setPrice(itemPrice);
		item.setDescription(description);
		
//		itemList.add(item);
		
		System.out.println("do you want add more items(yes/no)");
		 ch = sc.next();
		
		}while(ch.equals("yes"));
		
		Menu menu =app.getBean(Menu.class);
		menu.setMenuName(menuName);
		
		
		Restaurant  restaurant=app.getBean(Restaurant.class) ;
		restaurant.setName(rname);
		restaurant.setPhone(new BigInteger(rmobile));
		restaurant.setAddress(rcity);
		
	
		

		try {
			System.out.println("Restaurants added Successfully"+menuservice.add(restaurant));
		} catch (RestaurantNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		break;

	case 2:List<Restaurant> restur= menuservice.showRestaurant();
	  
	for (Restaurant rest : restur) {
		  System.out.println("rest name: "+rest.getName());
		  System.out.println("rest phone: "+rest.getPhone());
		  System.out.println("rest addr: "+rest.getAddress());
	}
	
		break;
	
	case 3 :
	
		System.out.println("Enter the name of the restaurant to search");
		String Rname =sc.next();
	
		try {
			Restaurant res = menuservice.searchByNameR(Rname);
			System.out.println("Restaurant found");
			
			System.out.println(res);
			
		} catch (RestaurantNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		break;
	case 4: break;
	
		
	}
	}
	while(choice < 4) ;
}

}
	
	/*Scanner sc= new Scanner (System.in);
	
	
	MenuServiceImpl service = new MenuServiceImpl();
		int choice;
	do {
		System.out.println(" 1.Add Restaurants \n 2.Show Restaurants \n 3.Search Restaurant by name");
    choice= sc.nextInt();
	switch (choice) {
	case 1: 
		
		List <Item> itemList = new ArrayList<>();
		Item item      = new Item("item1", 100.0, "The  1st item");
		Item itemOne   = new Item("item2", 150.0, "The  2nd item");
		Item itemThree = new Item("item3", 150.0, "The  3rd item");
		Item itemFour  = new Item("item4", 150.0, "The  4th item");
		Item itemFive  = new Item("item5", 130.0, "The  5th item");
		Item itemSix   = new Item("item6", 150.30, "The 6th item");
		Item itemSeven = new Item("item7", 150.20, "The 7th item");
		Item itemEight = new Item("item8", 1504.0, "The 8th item");
		Item itemNine  = new Item("item9", 1509.0, "The 9th item");
		Item itemTen   = new Item("item10", 150.0, "The 10th item");
		
		
		
		itemList.add(item)     ;
		itemList.add(itemOne)  ;
		itemList.add(itemThree);
		itemList.add(itemFour) ;
		itemList.add(itemFive) ;
		itemList.add(itemSix)  ;
		itemList.add(itemSeven);
		itemList.add(itemEight);
		itemList.add(itemNine) ;
		itemList.add(itemTen) ;
		
		Menu menu = new Menu("menu1", itemList);
		Menu menu1 = new Menu("menu2", itemList);
		
	//Restaurant  restaurant = new Restaurant("RestOne", new BigInteger("9502811146"), "Hyderabad",menu);
		//Restaurant  restaurant1 = new Restaurant("RestTwo", new BigInteger("996996996"), "Pune", menu1);
		//service.add(restaurant);
		//service.add(restaurant1);
		System.out.println("Restaurants added Successfully");
		break;
	case 2:
	
		System.out.println(service.showRestaurant());
	break;
	case 3 :
		List<Restaurant> restaurants = new ArrayList<Restaurant>() ;
		

		System.out.println("Enter the name of the restaurant to search");
		String Rname =sc.next();
	
		try {
			System.out.println(service.searchByNameR(Rname));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		break;
		
	}
	}
	while(choice < 4) ;
}

}



*/