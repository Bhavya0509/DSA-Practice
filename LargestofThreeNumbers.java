import java.util.Scanner;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. first approach
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
		sc.close();
		
		/*if(a>b && a>c) {
			System.out.println(a+" is the largest");
		}
		else if(b>c && b>a) {
			System.out.println(b+" is the largest");
		}
		else {
			System.out.println(c+" is the largest");
		}
		*/
		
		
		//2. ternary operator
		
		int largest1= a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		
		System.out.println(largest2 +" is the greastest");
	}

}
