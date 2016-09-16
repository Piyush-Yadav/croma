import bsh.This;

class A{
	 private int noOfGears = 5;
	public void add(int x){
		System.out.println("Sorry need another" +x);
	}
	
}

class B{
	
}


public class OverLoadingExaple extends A{

	
	public static void add(int x,int y){
		System.out.println("Sum of two num :"+(x+y));
	}
	
	public void add(int x,int y,int z){
		System.out.println("Sum of three num is :"+(x+y+z));
	}

	public static void main(String a[]){
		OverLoadingExaple o1 = new OverLoadingExaple();
		o1.add(15);
		System.out.println(o1.noOfGears);
	}
}
