import java.io.IOException;
	class X{
		 void method()throws IOException{
		  throw new IOException("device error");
		 }
		}


		class ThrowsExceptionExample{
		   public static void main(String args[]) throws IOException{//declare exception
		     X x=new X();
		     x.method();

		    System.out.println("Remaining code");
		  }
}
