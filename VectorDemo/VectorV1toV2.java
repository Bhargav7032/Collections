package com.VectorDemo;

import java.util.Vector;

public class VectorV1toV2 {
public static  void main(String[]args) {
	Vector v1=new Vector();

	v1.add("Bhargav");
	v1.add("satish");
	v1.add("viganesh");
	
  Vector v2=new Vector();
   v2.add("Rajesh");
   v2.add("venky");
	
   v1.addAll(0,v2);
   
//	for(int i=0;i<v2.size(); i++) {
//		v1.add(v2.get(i));
   
    
   
		System.out.println(v1);
	}
}

