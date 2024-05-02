package com.StackDemo;

import java.util.Stack;

public class StackSearch {
public static void main(String[] args) {
	Stack<String>name=new Stack<>();
	name.add("Bhargav");
	name.add("Bhagi");
	name.add("BhagyaRaj");
	System.out.println(name.search("Bhargav"));//return 3
	System.out.println(name.indexOf("Bhargav"));//return 0
}
}
