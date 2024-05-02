package com.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArray {
public static void main(String[]args) {
	ArrayList<String> al= new ArrayList<String>();
	al.add("Bhagi");
	al.add("Bhargav");
	al.add("bhagyaRaj");
	
	LinkedList<String> ll=new LinkedList<>();
	  ll.add("Sai");
	  ll.add("Chiru");
	  ll.add("nani");
	  ll.add("mohan");
	  ll.add("jagan");
	  ll.addAll(0,al);
	//  ll.set(2, "mohan");
	 System.out.println(ll.get(3));
		
	}
}

