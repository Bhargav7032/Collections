package com.MapDemo;
import java.util.*;
public class RetrievalOfValues {
public static void main(String[] args) {
	Map<Integer,String>m=new Hashtable<>();
	  m.put(121,"Bhargav");
	  m.put(122, "Bhagi");
	  m.put(123, "BhagyaRaj");
 
//		Collection<String>values=m.values();
//		for(String value:values) {
//			System.out.println(value);
	  
  //retrieval of value from the map based on a key
	//  System.out.println(m.get(122));
	  
	  Set<Integer>keys=m.keySet();
		for(Integer key:keys) {
       System.out.println(key+">>>>"+m.get(key  ));
}
}
}

