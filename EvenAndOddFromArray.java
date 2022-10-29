
public class EvenAndOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" it is even");
			}
			else {
				System.out.println(a[i]+" it is odd");
			}
		}

	}

}
