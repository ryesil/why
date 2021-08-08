package create_write_textfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reeed02 {
public static void main(String[] args) {
	File file=new File("tepis.txt");
	
	try (BufferedReader br=new BufferedReader(new FileReader(file))){
		String line;
		int nu=1;
		while((line=br.readLine())!=null) {
			System.out.println("Line "+ nu+" : "+line);
			nu++;
		}
	} catch (FileNotFoundException e) {
	System.out.println("file not found");
	} catch (IOException e1) {
		System.out.println("File couldn't open");
	}
	

}
}
