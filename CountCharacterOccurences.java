
public class CountCharacterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we need to tell how many times a is repeated
		
		// my approach
		String s="java programming java oops";
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
		
		// sir approach
		
		int totalCount=s.length();
		int countAfterReplacingA= s.replaceAll("[a]", "").length();
		
		int count1=totalCount-countAfterReplacingA;
		System.out.println(count1);
		
	}

}
