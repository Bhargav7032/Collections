package com.MapDemo;
import java.util.*;
import java.util.Map.Entry;
public class MapSize {
public static void main(String[] args) {
 Map<Integer,String>map=new Hashtable<>();
	map.put(98, "arun");
	map.put(99, "siva");
	map.put(100, "Ram");
	System.out.println( );
//	map.clear();
//	System.out.println(map);
	
	Set<Entry<Integer,String>>entries=map.entrySet();
	for(Entry<Integer,String>entry:entries) {
		Integer key=entry.getKey();
		String value=entry.getValue();
		System.out.println(key+">>>"+value);
	}
	
	
}

}
