import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();
		
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
