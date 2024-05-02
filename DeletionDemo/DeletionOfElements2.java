package com.DeletionDemo;

import java.util.Vector;

public class DeletionOfElements2 {
public static void main(String[] args) {
	Vector a1=new Vector();
	a1.add("raj");
	a1.add("mohan");
	a1.add("ram");
	
	Vector a2=new Vector();
	a2.add("kiran");
	a2.add("siva");
	a2.add("ravi");
	
	a1.addAll(0,a2);
	a1.removeAll(a2);
	System.out.println(a1);
}
}
