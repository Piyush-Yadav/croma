
public class TryFinally {

	
	//Exception occur and not handled
	 public static void main(String args[]){  
		  try{  
		   int data=100/0;  
		   System.out.println(data);  
		  }   
		  catch(NullPointerException e){
			  System.out.println(e);
			  } 
//Exception handling code
		  catch(ArithmeticException e){
			  System.out.println(e);
			  } 
		  finally{
			 
			  System.out.println("Finally executed");
			  }  
		  System.out.println("Remaining code");  
		  }  
}


































