package com.collectionBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
public static void main(String[] args) {
	Student s1=new Student(12,"bhargav","bhargav@.com");
	Student s2=new Student(13,"chiru","Chiru@.com");
	Student s3=new Student(14,"Sai","Sai@.com");
	Student s4=new Student(15,"balaji","balaji@.com");

//Student[]Students= {};
	ArrayList<Student>students=new ArrayList<>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
//students.add("");
//students.add(10);
//students.add(ture);

Iterator<Student>itr=students.iterator();
    while(itr.hasNext()) {
	Student student=(student)=itr.next();
	System.out.println(student);
    }
	
	}

}
