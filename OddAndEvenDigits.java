
public class OddAndEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 145678;
		int countEven=0;
		int countOdd=0;
		int rev=0;
		
		while(num>0) {
			rev = num%10;
			if(rev%2==0) {
				countEven++;
			}
			else if(rev%2!=0) {
				countOdd++;
			}
			
			num=num/10;
		}
		

		System.out.println("even digits "+countEven);
		System.out.println("odd digits "+countOdd);
	}

}
