package com.collectionBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {
public static void main(String[] args) {
ArrayList<String>Al=new ArrayList<>();   
Al.add("AlluArjun");
Al.add("Jr.NTR");
Al.add("Nani");
Al.add("RajiniKanth");

Iterator<String> itr=Al.iterator();
itr.forEachRemaining(a->{
	System.out.println(a);
});
}
}