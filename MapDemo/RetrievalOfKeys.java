package com.MapDemo;
import java.util.*;
public class RetrievalOfKeys {
public static void main(String[] args) {
	Map<Integer,String>m=new Hashtable<>();
	  m.put(532408,"ponnada");
	  m.put(532401, "Srikakulam");
	  m.put(500050, "Hydrabad");

	Set<Integer>keys=m.keySet();
	for(Integer key:keys) {
		System.out.println(key);
	}
	
}
}
