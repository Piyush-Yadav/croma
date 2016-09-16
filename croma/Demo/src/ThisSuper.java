import org.junit.Test;

class Parent{
	String str = "from Parent";
}


public class ThisSuper extends Parent{
	String str = "from Child";
	
	@Test
	public void main(String[] args) {
		ThisSuper child = new ThisSuper();
		System.out.println(child.str);
	}
}
