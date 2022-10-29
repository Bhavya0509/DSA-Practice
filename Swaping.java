
public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5 ways to swap two numbers
		
		//1. using temporary variable
		
		int x=10;
		int y=20;
		
		int temp=0;
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println(x);
		System.out.println(y);
		
		//2.Addition and subtraction
		
		int c=10;
		int d=20;
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println(c);
		System.out.println(d);
		
		//3.Multiplication and division
		
		int e=10;
		int f=20;
		
		e=e*f;
		f=e/f;
		e=e/f;
		
		System.out.println(e);
		System.out.println(f);
		
		//4. using xor
		
		int g=10;
		int h=20;
		
		g=g^h;
		h=g^h;
		g=g^h;
		
		System.out.println(g);
		System.out.println(h);
		
		//5.single statement
		//execution starts from left
		int a=10;
		int b=20;
		
		b=a+b-(a=b);  //value of a will become 20  , then 30-20 will be 10 that will be value of b
		
		System.out.println(a);
		System.out.println(b);

	}

}
