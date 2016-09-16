public class Palendrome {
	static public void checkPalandrome(String a){
		System.out.println();
		System.out.println();
		System.out.println("Insert string is : "+a);
		String str ="";
		for(int i = a.length()-1;i>=0;i--){
			//System.out.println(a.charAt(i));
			str = str + a.charAt(i);
		}
		System.out.println("New String is : "+str);
		
		
		if(str.equals(a)){
			System.out.println("Yes it is palendrome");
		}
		else{
			
			System.out.println("No its not palendrome");
		}
		
	}
	
	
	public static void main(String a[])
	{
		checkPalandrome("ajeet");
		checkPalandrome("qweewq");
		checkPalandrome("nitin");
	}
	
	
}
