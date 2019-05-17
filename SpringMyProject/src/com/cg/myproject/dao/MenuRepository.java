/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuRepository interface used to specify the methods
* 
*/
package com.cg.myproject.dao;

import java.util.List;

import com.cg.myproject.dto.Item;
import com.cg.myproject.dto.Restaurant;

public interface MenuRepository {
	
	public Restaurant save(Restaurant restaurant);
	public Restaurant findByName(String name);
	public List<Restaurant> getRestaurant();
	

}