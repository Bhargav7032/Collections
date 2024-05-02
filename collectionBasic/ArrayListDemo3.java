package com.collectionBasic;

import java.util.ArrayList;

public class ArrayListDemo3 {

		public static void main(String[] args) {
			ArrayList objects = new ArrayList();
			String s1 = null;
			System.out.println(objects.size());
			objects.add(10);// 0
			objects.add(12);// 1
			objects.add(11);// 2
			objects.add(13);
			objects.add("hello");
			objects.add("hello");
//			objects.add(new Student());
//			objects.add(new Object());
//			objects.add(new Exception());
			objects.add(s1);
			objects.add(s1);
			objects.add(s1);
			objects.add(s1);
			System.out.println(objects);

//			System.out.println(objects.size());
//			System.out.println(objects.get(0));
			/*
			 * int oldCapacity = 10; int newCapacity = (oldCapacity * 3) / 2 + 1;
		 * System.out.println(newCapacity);
			 */

			ArrayList objects2 = new ArrayList(100);

//		 ArrayList  al=new ArrayList(Collection c);
		}

	}


