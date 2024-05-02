package com.Verification;

import java.util.Vector;

public class VerificationOfElements2 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add("SaiKumar");
	v1.add("balaji");
	v1.add("Pavan");
	
	Vector v2=new Vector();
	v2.add("krishna");
	v2.add("banu");
	v2.add("uma");
	
	v1.add(v2);
//	System.out.println(v1.contains(v1));
     System.out.println(v1.containsAll(v2));
}
}
