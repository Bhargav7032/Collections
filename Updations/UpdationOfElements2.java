package com.Updations;

import java.util.Arrays;
import java.util.Vector;

public class UpdationOfElements2 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add("ram");
	v1.add("manikanta");
	v1.add("janikiram");
	
	Vector v2=new Vector();
	
	v2.add("kaliyan");
	v2.add("harish");
	v2.add("hemanth");
	
      v1.add(v2);
    
	//System.out.println(v1.get(0));
	//v1.set(0, "Bhargav");
	//System.out.println(v1);
    //System.out.println(v2.get(0));
//	System.out.println(v1.indexOf("manikanta"));
	//System.out.println(v1.lastElement());
//	System.out.println(v2.firstElement());	
     Object[]array=v1.toArray();
     System.out.println(Arrays.toString(array));
}
}
