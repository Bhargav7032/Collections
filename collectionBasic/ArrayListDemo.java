package com.collectionBasic;

import java.util.ArrayList;

public class ArrayListDemo {
		public static void main(String[] args) {
			ArrayList objects = new ArrayList();
			objects.add(10);
			objects.add(12.123);
			objects.add(true);
			objects.add(56l);
			objects.add("hello");
			objects.add('c');

			System.out.println(objects);
		}

	}

