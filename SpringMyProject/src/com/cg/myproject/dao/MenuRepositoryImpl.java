package com.cg.myproject.dao;
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuRepositoryImpl class which implements the logic 
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.myproject.dto.Item;
import com.cg.myproject.dto.Restaurant;

import co.cg.myproject.DBUtil.DBUtil;
@Repository("repo")//creates a bean for this class as repo
public class MenuRepositoryImpl implements MenuRepository {


	public MenuRepositoryImpl() {
		
	}
	
	
	@Override
	public Restaurant save(Restaurant restaurant) {
		DBUtil.restaurants.add(restaurant);
		return restaurant;
	}

	@Override
	public Restaurant findByName(String name) {
		List<Restaurant> restaurantList = DBUtil.restaurants;
		for (Restaurant restaurant : restaurantList) {
			if(restaurant.getName().equalsIgnoreCase(name)) {
			 return restaurant;
			 
			}
		}
		return null;
	}
	

	@Override
	public List<Restaurant> getRestaurant() {
		return DBUtil.restaurants;
	}

	
	
	
}
