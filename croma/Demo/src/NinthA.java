public class NinthA {
	
	String name;
	String sec ;
	int age;
	
	public void addData(String name1,String sec1,int age1){
		name = name1;
		sec = sec1;
		age = age1;
	}
	
	public void showData(){
		System.out.println("Name : "+name);
		System.out.println("SEC : "+sec);
		System.out.println("Age : "+age);
		System.out.println();
	}
	
	public static void main(String a[]){
		NinthA navneet = new NinthA();
		navneet.addData("Navneet", "A", 14);
		navneet.showData();
		NinthA dhruv = new NinthA();
		dhruv.addData("Dhruv", "Y",2);
		dhruv.showData();
	}
}
