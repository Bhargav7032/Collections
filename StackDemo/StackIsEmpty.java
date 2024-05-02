package com.StackDemo;

import java.util.Stack;

public class StackIsEmpty {
public static void main(String[]args) {
	Stack<String>colours=new Stack<>();
	colours.add("Green");
	colours.add("Red");
	colours.add("yellow");
	System.out.println(colours.empty());
	System.out.println(colours.isEmpty() );
	//System.out.println(colours);
}
}
