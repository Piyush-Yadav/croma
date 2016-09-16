
public class ThrowExample {
	   public void validate(int marks){
	     if(marks<33){
	    	 System.out.println( marks);
	      throw new ArithmeticException("Ohhh You are failed");
	 	}
	     else{
	    	 System.out.println(marks);
	      System.out.println("Its party time you are pass");
	     }
	 }
	   
	   public static void main(String args[]){
		   ThrowExample t = new ThrowExample();
		   t.validate(31);
	      System.out.println("Remaining code");
	  }
}
