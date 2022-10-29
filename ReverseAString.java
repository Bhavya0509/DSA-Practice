import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 ways to reverse a string
		
		//1. inverse loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		sc.close();
		//String rev="";
		/*
		for(int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
		}
		
		System.out.println(rev); */

		//2. character array
		
		/*char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev +=arr[i];
		}
		
		System.out.println(rev); */
		
		
		//3.string buffer
		
		//StringBuffer sb=new StringBuffer(str);
		//System.out.println(sb.reverse());
		
		
		
		//4.String builder
		StringBuilder stb=new StringBuilder();
		stb.append(str);
		System.out.println(stb.reverse());
		
	}

}
