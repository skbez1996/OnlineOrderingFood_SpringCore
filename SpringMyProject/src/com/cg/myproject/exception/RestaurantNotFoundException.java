/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the RestaurantNotFoundException class which extends RunTimwe Exception
*/
package com.cg.myproject.exception;
// this class throws an exception at runtime
public class RestaurantNotFoundException extends RuntimeException {

	public RestaurantNotFoundException() {
		super();
	
	}

	public RestaurantNotFoundException(String msg) {
		super(msg);
		
	}
	
	
}
