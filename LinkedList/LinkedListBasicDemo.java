package com.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListBasicDemo {
public static void main(String[] args) {
LinkedList<String>ll=new LinkedList<>();
ll.add("B1");
ll.add(null);
ll.add("B2");
ll.add("B3");
ll.add("B3");
ll.add(null);
ll.add("B4");
ll.add("B4");
ll.add("B5");
ll.add(null);
System.out.println(ll);
Collections.synchronizedList(ll);
}
}

