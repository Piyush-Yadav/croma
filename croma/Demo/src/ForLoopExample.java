public class ForLoopExample {
	
	public void printTable(int num){
		System.out.println("Lets print the table of "+num);
		int result;
		for(int i = 1; i<=20; i++){
			result = num*i;
			System.out.println(num+" x "+i+" = "+result);
		}		
	}
	
	public static void main(String a[]){
		ForLoopExample t1= new ForLoopExample();
		t1.printTable(12);
	}
}
