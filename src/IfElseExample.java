import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
	//	System.out.println("Please enter the marks");
		//Scanner scan = new Scanner(System.in);
		//int marks = scan.nextInt();
		int marks = 20;
		
		if(marks<33){
			System.out.println("Failed");
			}
		else if(marks>33 && marks <=80){
			System.out.println("Passed");
		}
		else if(marks >80 && marks <90){
			System.out.println("Need some hard work");
		}
		else{
			System.out.println("Default");
		}
		}
}
