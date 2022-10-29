import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array should be sorted
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		//Approach 1
		
		//System.out.println(Arrays.binarySearch(a, 6));
		
		// Approach 2 
		
		int low=0;
		int high=a.length-1;
		int key=6;
		boolean status=false;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(a[mid]==key) {
				status=true;
				break;
			}
			else if(key<a[mid]) {
				high=mid-1;
			}
			else if(key>a[mid]) {
				low=mid+1;
			}
		}
		if(status==false) {
			System.out.println("element is not present");
		}
		else {
			System.out.println("element is present");
		}
	}

}
