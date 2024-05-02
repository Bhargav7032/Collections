package com.Verification;

import java.util.Vector;

public class VerificationOfElements {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add("SaiKumar");
	v1.add("balaji");
	v1.add("Pavan");
	
	Vector v2=new Vector();
	v2.add("krishna");
	v2.add("banu");
	v2.add("uma");
	
	Vector v3=new Vector();
	v3.add("banu");
	v3.add("uma");
	v3.add("krishna");

	
	
	//v1.add(v3);
	v2.add(v3);
//	System.out.println(v1.contains(v1));
   //  System.out.println(v1.containsAll(v3));
	System.out.println(v2.containsAll(v3));
	System.out.println(v2.contains(v2));
}
}
