package com.StackDemo;

import java.util.Stack;

public class StackPeek {
public static void main(String[] args) {
	//following LIFO
	
	Stack<String>Heroes=new Stack<>();
	Heroes.add("AlluArjun");
	Heroes.add("rajinikanth");
	Heroes.add("Jr.NTR");
	System.out.println( Heroes.peek());
	System.out.println(Heroes);
}
}
