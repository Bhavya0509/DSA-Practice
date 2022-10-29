import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//1. Filereader and Bufferedreader
		
		/*FileReader fr=new FileReader("C:\\Users\\2046171\\eclipse-workspace\\readfile.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}*/
		
		//2. file class and scanner class
		
		File file=new File("C:\\Users\\2046171\\eclipse-workspace\\readfile.txt");
		Scanner sc=new Scanner(file);
		
		/*while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}*/

		//3. approach 3
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
	}

}
