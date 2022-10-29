
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// finding the factorial of a number

		//Approach 1
		//5!=5*4*3*2*1
		
		int num = 5;
		int factorial = 1;

		/*for (int i = num; i >= 1; i--) {

			factorial *= i;               //5*1, 5*4, 20*3, 60*2, 120*1
		}

		System.out.println(factorial); */
		
		
		//Appraoch 2
		//5!= 1*2*3*4*5
		
		
		for(int i=1;i<=num;i++) {
			factorial *= i;             //1*1, 1*2, 2*3, 6*4, 24*5 =120
			
		}
		
		System.out.println(factorial);

	}
	
}
