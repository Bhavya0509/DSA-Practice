import java.util.HashSet;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check wheather duplicate number is present in array or not
		
		//appraoch 1
		String arr[] = {"java","C","C++","python","java"};
		
		boolean flag=false;
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
				}
			}
		}
		if(flag==true) {
			System.out.println("Array contains duplicates");
		}
		else {
			System.out.println("Array does not contain duplicates");
		}
		*/
		
		//approach 2 :- hashset
		//As hashset only contains unique values, it will not add value twice, it will show false if add again
		
		HashSet<String> hs= new HashSet<String>();
		for(String s:arr) {
			if(hs.add(s)==false) {
				System.out.println("Duplicate element found "+s);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No duplicates");
		}

	}

}
