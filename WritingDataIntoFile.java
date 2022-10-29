import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("C:\\Users\\2046171\\eclipse-workspace\\writefile.txt");
		BufferedWriter br=new BufferedWriter(fw);
		
		fw.write("hi i am richie");
		fw.write("richie is happy");
		
		System.out.println("finished");
		br.close();
		

	}

}
