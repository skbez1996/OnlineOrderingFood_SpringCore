/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuServiceIMPl class which implements the logic of the functionalities
*/
package com.cg.myproject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.myproject.dao.MenuRepository;
import com.cg.myproject.dao.MenuRepositoryImpl;
import com.cg.myproject.dto.Item;
import com.cg.myproject.dto.Menu;
import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;
@Service("menuservice")
public class MenuServiceImpl implements MenuService{
	@ Autowired
	MenuRepositoryImpl repo ;

	@Override
	public Restaurant add(Restaurant restaurant) {
		
		return repo.save(restaurant);
	}

	@Override
	public Restaurant searchByNameR(String restaurantName) throws RestaurantNotFoundException{
		
		Restaurant rest = repo.findByName(restaurantName);
		if(rest == null)
			throw new RestaurantNotFoundException("Restaurant not found");
		return rest;
		
	}
/*
//	@Override
//	public Menu add(Menu menu) {
//		// TODO Auto-generated method stub
//		return null;
//	}
*/

	@Override
	public List<Restaurant> showRestaurant() {
		return repo.getRestaurant();
	}

	
	
	
	
	
	
}
