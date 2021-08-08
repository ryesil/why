package create_write_textfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWriteTextFiles {
	public static void main(String[] args) {
		
		File file=new File("tepis.txt");
		try(BufferedWriter br=new BufferedWriter(new FileWriter(file))){
			br.write("This is Ramazan Yesil");
			br.newLine();
			br.write("I am from Turkey");
			br.newLine();
			br.write("I came here with my wife and $3000 in my pocket");
			br.newLine();
			br.write("End");
			br.newLine();
			br.write("Hi");
		} catch (IOException e) {
		System.out.println("Unable to read");
		}
		
		
	}

}
