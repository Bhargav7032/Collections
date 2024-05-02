package com.MapDemo;
import java.util.*;
public class VerificationsOfKeys {
	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<>();
		m.put(201, "Saikumar");
        m.put(202, "Chiru");
        m.put(203, "harish"); 
        
       System.out.println(m.containsKey(202));//true
       System.out.println(m.containsKey(204));//false

	}
}
