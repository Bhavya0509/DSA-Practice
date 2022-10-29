import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		
		int original_num =num;
		
		int rev=0;
		while(num>0) {
			rev =rev*10 +num%10;
			num=num/10;
			
		}
		//System.out.println(rev);
		
		if(original_num==rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
