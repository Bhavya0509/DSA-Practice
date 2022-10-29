
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,2,7,9,6};
		
		int sum=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum +=a[i];
		}

		System.out.println(sum);
		
		System.out.println();
		
		//enhanced for loop
		
		for(int i:a) {
			sum2 +=i;
		}
		
		System.out.println(sum2);
	}

}
