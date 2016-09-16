
public class VariablesExample {

	static int rollNo;
	static String collegeName;
	String name;
	
	public void setValues(int rn,String n,String cname){
		rollNo=rn;
		collegeName=cname;
		name=n;
	}
	
	public static void main(String a[]){
		//rollNo = new Integer(rollNo);
		
		VariablesExample o1=new VariablesExample();		
		System.out.println(o1.rollNo+"  "+collegeName+"   "+o1.name);
		o1.setValues(213123,"Pankaj", "JSS");
		System.out.println(o1.rollNo+"  "+VariablesExample.collegeName+"   "+o1.name);
		
		
		VariablesExample o2=new VariablesExample();		
		System.out.println(o2.rollNo+"  "+collegeName+"   "+o2.name);
		o2.setValues(1122222,"Ravi", "JSS");
		System.out.println(o2.rollNo+"  "+collegeName+"   "+o2.name);
	}
	
}
