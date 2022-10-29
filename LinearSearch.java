
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,40,30,50};
		int search_ele=50;
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==search_ele) {
				status =true;
				
			}
		}
		if(status==true) {
			System.out.println("Array contains the searched element");
		}
		else {
			System.out.println("Array does not contain the search element");
		}
		
	}

}

