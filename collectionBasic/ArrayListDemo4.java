package com.collectionBasic;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.tools.javac.Main;

public class ArrayListDemo4 {
public static void getAllArrayList(ArrayList<String>products) {
	for(String product:products) {
		System.out.println(products);
	}
}
public static void main(String[]args) {
ArrayList<String>dairyproducts=new	ArrayList<>();
dairyproducts.add("milk");
dairyproducts.add("curd");
dairyproducts.add("ghee");
dairyproducts.add("panneer");
dairyproducts.add("cheese");

ArrayList<String>fruits=new ArrayList<>();
fruits.add("Apple");
fruits.add("mango");
fruits.add("Banana");
fruits.add("grapes");
fruits.add("pinapple");

ArrayList<String>products=new ArrayList<>(dairyproducts);
products.addAll(fruits);

getAllArrayList(products);
System.out.println("------------------");


Iterator<String>itr=products.iterator() ;
while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("--------------------");

for(int i=0;i<products.size();i++) {
	System.out.println(products.get(i));
}
System.out.println("--------------------");
products.forEach(System.out::println);

}
}

