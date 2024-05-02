package com.collectionBasic;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsedListitertor {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("BalayyaBabu");
	al.add("Chiranjeevi");
	al.add("venky mama");
	al.add("NagaArjuna");
	
ListIterator<String> itr= al.listIterator();
System.out.println("In forword diraction");
System.out.println("...............................");
while(itr.hasNext()) {
	System.out.println(itr.next());
}
 
	System.out.println("In Reverse diraction");
	System.out.println(".............................");
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
}
}