package JavaPractices;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		File file = new File("src/test/resources/text.txt");
		file.createNewFile();
		//file.delete();
		boolean exixts = file.exists();
		System.out.println(" File Is exixts:"+exixts);
		System.out.println(" File Length:"+file.length());
		System.out.println(" File read:"+file.canRead());
		System.out.println(" File path:"+file.getAbsolutePath());
		
		
		
	}

}
