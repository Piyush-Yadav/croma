import java.util.Scanner;

import com.thoughtworks.selenium.condition.Condition;

public class DoWhileLoop {
public static void main(String a[]){
	Scanner scan = new Scanner(System.in);
	String condition = null;
	do{
		System.out.println("Please enter the name");
		String name = scan.next();
		System.out.println("You entered "+name);
		
		System.out.println("Do you want to add new name");
		condition = scan.next();
		System.out.println();
		System.out.println();
	}while(condition.equals("y"));
	
	System.out.println("Thanks for using the system");
}
}
