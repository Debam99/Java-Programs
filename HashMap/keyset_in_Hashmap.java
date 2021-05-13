	import java.util.HashMap;
import java.util.*;  
	
public class keyset_in_Hashmap {

	  public static void main(String args[]) {  
	  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
	  hash_map.put(1, "Red");
	  hash_map.put(2, "Green");
	  hash_map.put(3, "Black");
	  hash_map.put(4, "White");
	  hash_map.put(5, "Blue");
	  
	  
	  Set <Integer> keys= hash_map.keySet();
	  
	  for(Integer key : keys){
		  System.out.println(key+" "+hash_map.get(key));
	  }
	  
	  
	    
	 }  
	}




