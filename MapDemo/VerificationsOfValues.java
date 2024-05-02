package com.MapDemo;
import java.util.*;
public class VerificationsOfValues {
public static void main(String[] args) {
	Map<Integer,String>bagi=new Hashtable<>();
	bagi.put(123, "Ashok");
	bagi.put(124, "Charan");
	bagi.put(125,"Mohan");
	System.out.println(bagi.containsValue("Ashok"));//true
	System.out.println(bagi.containsValue(bagi));//false
}
}
