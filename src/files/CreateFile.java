package files;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		String filePath="C:\\Users\\APARNA.A\\Documents\\test\\java.pdf";
		File file;
		
		try {
			file=new File(filePath);
			file.createNewFile();
		} catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
