package com.croma.package1;

abstract class ClassPackage2 {
	abstract void show();
}

class ClassPackage3 extends ClassPackage2 {
	
}

public class ClassPackage1 extends ClassPackage3{
		void show(){
			System.out.println("hELLO");
		}
	
	public static void main(String[] args) {
		ClassPackage1 obj2 = new ClassPackage1();
		obj2.show();
	}
}


