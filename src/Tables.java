import java.util.Scanner;

public class Tables {

	public static void main(String a[]){
		System.out.println("Please inter the number :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Writing the table of :"+num);
		
		for(int i=1 ; i<=100; i++){
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
	}
}