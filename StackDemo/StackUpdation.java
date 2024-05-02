package com.StackDemo;

import java.util.Stack;

public class StackUpdation {
	public static void main(String[] args) {
		Stack<String> car = new Stack<>();
		car.add("BMW");
		car.add("suziki");
		car.add("TaTa sumo");

		Stack<String> colour = new Stack<>();
		colour.add("Black");
		colour.add("Red");
		colour.add("Green&Red mixed");

		//car.addAll(colour);

//		car.set(0, "Marithi");
//		System.out.println(car);
//		System.out.println(colour.get(0));
//		System.out.println(car.indexOf("TaTa sumo"));
        System.out.println(colour.firstElement());
		System.out.println(colour.lastElement());
	}
}
