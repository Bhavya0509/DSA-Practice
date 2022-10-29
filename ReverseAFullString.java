
public class ReverseAFullString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Welcome in java";
		String reverse="";
		
		String[] ar=s.split(" ");
		for(int i=ar.length-1;i>=0;i--) {
			String reverseWord="";
			for(int j=ar[i].length()-1;j>=0;j--) {
				reverseWord=reverseWord+ar[i].charAt(j);
			}
			reverse=reverse+reverseWord+" ";
		}
		System.out.print(reverse);
	}

}
