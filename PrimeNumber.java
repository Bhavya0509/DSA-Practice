import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sc.close();
		
		int count=0;
		
		if(n>1) {
			
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("It is a prime number");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
