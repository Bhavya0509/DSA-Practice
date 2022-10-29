
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array should not have duplicates
		// array should be in a range
		//array need not to be sorted
		
		int[] a= {1,2,4,5};  //here misssing number is 3
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
			
		}
		
		int actualSum=0;
		for(int i=1;i<=5;i++) {
			actualSum +=i;
		}

		int MissingNum= actualSum-sum;
		System.out.println(MissingNum);
	}

}
