import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5};
		int[] b={1,2,3,4,5};
		
		//approach1
		//boolean status =Arrays.equals(a, b);
		//System.out.println(status);
		
		
		//approach2
		
		boolean status =true;
		
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
			
		}
		else {
			status=false;
		}
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
 
	}

}
