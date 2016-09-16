package com.croma.package2;

import com.croma.package1.ClassP2;

public class Student {

	String name;

	public void m1(){
		System.out.println("p1m1");
		//System.out.println(ClassP2.m2());
		String s = ClassP2.m2();
		System.out.println(s);
	}

	public static void main(String a[]){
		Student s1 = new Student();
		s1.m1();
	}
	
	
}
