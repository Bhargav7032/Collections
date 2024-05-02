package com.StackDemo;

import java.util.Stack;

public class Stackpush {
public static void main(String[] args) {
	Stack<String>bag=new Stack<>();
	bag.push("safari");
	bag.push("Sky"); 
	bag.push("Hp");
	System.out.println(bag);
	System.out.println(bag.pop());
	System.out.println(bag);
	
}
}
