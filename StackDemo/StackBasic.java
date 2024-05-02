package com.StackDemo;

import java.util.Stack;

public class StackBasic {
public static void main(String[]args) {
	//LIFO means last in first out - Stack
	//FIFO means first in first out - Queue
	Stack<String>pen=new Stack<>();
	pen.add("Blue");
	pen.add("Red");
	pen.add("Black");
	
	Stack<String>Book=new Stack<>();
	Book.add("yellow");
	Book.add("green");
	Book.add("orange");
	
	pen.addAll(Book);
	
	pen.remove(0);
	
	System.out.println(pen);
}
}
