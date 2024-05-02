package com.RetrievalOfElements.copy;

import java.util.Vector;

public class RetrievalOfElements {
public static void main(String[] args) {
	Vector v1=new Vector(); 
	v1.add("Revi");
	v1.add("Bhagi");
	v1.add("Saikumar");
	
	Vector v2=new Vector();
	v2.add("jagadeesh");
	v2.add("charan");
	v2.add("Ashok");
		
	System.out.println(v1.get(2));
	System.out.println(v2.get(2));
}
}
