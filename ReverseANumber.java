import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 ways to reverse a number
		
		//1.traditional approach
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		
	/*	int r=0;
		while(num>0) {
		    r=num%10;                     //r=r*10+num%10;
			num=num/10;
			System.out.print(r);
		}
		*/
		
        //2. using string buffer
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println(rev); */
		
		//3. using string builder
		StringBuilder stb=new StringBuilder();
		stb.append(num);
		System.out.println(stb.reverse());
		
		
		
	}

}
