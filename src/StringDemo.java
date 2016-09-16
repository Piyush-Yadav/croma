
public class StringDemo {
	
	static void m1(){
		 
	}
	
	static void m1(int a){
		 
	}

	public static void main(String[] args) {
		String s1 = "WELCOME";
		String s2 = "Welcome";
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s2));//ture 
		System.out.println(s1.equals(s3));//true  
		System.out.println(" <><><><><?><><><>    "+s2.toUpperCase());//false
	
	}
	
	
class A extends StringDemo{
		
			
	
		
		
	}
	
}
