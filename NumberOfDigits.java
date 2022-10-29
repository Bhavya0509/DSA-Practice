
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//my method
		
		int number=12345;
		
		String str = String.valueOf(number);
		
		System.out.println(str.length());
		
		
		//sir method
		
		int num=456889876;
		int count=0;
		
		while(num>0) {
			 num=num/10;  
			count++;
		}
		
		System.out.println("Number of digits in the given number are "+count);
		
	}	

}

/* 123/10  3  12/10  2 1/10  1 
 *                       */
