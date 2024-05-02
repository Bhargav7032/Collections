package com.RetrievalOfElements.copy;

import java.util.Vector;

public class RetrievalOfElements2 {
public static void main(String[] args) {
	Vector v1=new Vector(); 
	v1.add("jagadeesh");
	v1.add("charan");
	v1.add("Ashok");
		
	Vector v2=new Vector();
	v2.add("Revi");
	v2.add("Bhagi");
	v2.add("Saikumar");
		
	System.out.println(v1.get(2));
	System.out.println(v2.get(2));
}
}
