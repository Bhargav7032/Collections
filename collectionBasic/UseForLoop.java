package com.collectionBasic;

import java.util.ArrayList;

public class UseForLoop {
public static void main(String[]args) {
	ArrayList<String> Bagi=new ArrayList<>();
	Bagi.add("Bhargav");
	Bagi.add("charan");
	Bagi.add("jagadeesh");
	Bagi.add("Raviteja");
	Bagi.add("BalayyaBabu");
	Bagi.add("Chiranjeevi");
	for(int i=0;i<Bagi.size();i++) {
  System.out.println(Bagi.get(i));
	}
}
}
