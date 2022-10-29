
public class RemoveJunkFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We need to remove special characters
		
		String s="!@#$%^&*( vgyshssksjtdd (*&%$#^&*)) 93764574483993";
 
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
