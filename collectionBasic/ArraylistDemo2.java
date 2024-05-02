package com.collectionBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		names.add("Bhargav");
		names.add("Balaji");
		names.add("Hari");
		names.add("Sai");
//		System.out.println(names);
//		System.out.println(names.size());
//		System.out.println(names.isEmpty());
//		System.out.println(names.get(0));
//		System.out.println("***************");
//		System.out.println(names.remove(0));
//		System.out.println(names.get(0));
//		System.out.println(names);

		names.set(1, "Emma");
		System.out.println(names);
		int position = names.indexOf("Emma");
		System.out.println("********************");
		System.out.println(position);
		if (position != -1) {
			names.set(position, "hello");
		} else {
			System.out.println("invalid name");
		}

		System.out.println(names);

		System.out.println(names.contains("Bhargav"));

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("********************");
		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

