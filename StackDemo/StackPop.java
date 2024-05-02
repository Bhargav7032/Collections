package com.StackDemo;

import java.util.Stack;

public class StackPop {
public static void main(String[] args) {
	Stack<String>st=new Stack<>();
	st.add("Bhargav");
	st.add("viganesh");
	st.add("Satish");
	System.out.println(st.pop());
	System.out.println(st);
}
}
