import java.util.Arrays;
import java.util.Collections;

public class SortingUsingBuiltInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {5,4,1,2,3};
		
		//1 . Approach 1
		
		//Arrays.parallelSort(a);
		//System.out.println(Arrays.toString(a));
		
		//2. Approach 2
		
		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		
		//3. for printing in reverse
		
		Integer[] a1= {5,6,3,2,1,8,7};
		Arrays.sort(a1,Collections.reverseOrder());;
		System.out.println(Arrays.toString(a1));
	}
}
