package com.Updations;

import java.util.Arrays;
import java.util.Vector;


public class UpdationOfElements {
public static void main(String[] args) {
	//size no of elements present in list
	//capacity Array capacity -10
	
	//vector java 1.0
	//collections 1.2
	//Generic 1.5
	
	Object[]arr=new Object[] {1,7,9,5,1};
	Vector v1=new Vector<>();
	v1.add("ram");
	v1.add(null);
	v1.add(12);
	v1.add(null);
	v1.add(12);
	
//	int sum = 0;
//	for(int i = 0;i<v1.size();i++);
//    sum +=(Integer)v1.get('i');

	System.out.println("size"+v1.size());
	System.out.println("capacity"+v1.capacity());
	System.out.println(v1);
	}
}
