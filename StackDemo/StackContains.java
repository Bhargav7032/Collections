package com.StackDemo;

import java.util.Stack;

public class StackContains {
public static void main(String[] args) {
	Stack<String>movies=new Stack<>();
	movies.add("Pushpa");
	movies.add("RRR");
	movies.add("Avatar");
	System.out.println(movies.contains("Pushpa"));//true
	System.out.println(movies.contains("Avatar2"));//false
}
}
