
public class Sorting {

	
	public static void getHighest(int[] a,int no){
		int temp;
		
		for(int j=0;j<no;j++){
			for(int i=0;i<a.length-1;i++){
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(no+" highest is : "+a[a.length-no]);
	}
	
	
	public static void main(String a[]){
		int[] arr={1,7,4,8,9,3,2,678767,787,5454,8787};
		getHighest(arr, 2);
		
	}
	
}
