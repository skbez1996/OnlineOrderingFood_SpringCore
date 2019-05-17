  
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item DBUTIL class to store the details
* 
*/
package co.cg.myproject.DBUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.myproject.dto.Restaurant;
//import com.mysql.jdbc.Connection;

public interface DBUtil {

	public static List<Restaurant> restaurants = new ArrayList<Restaurant>() ;

	
}
