package try_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App2 {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File("text.txt")))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find the file:" + new File("text.txt".toString()));
		} catch (IOException e) {
			System.out.println("Unable to read the file");
		}
		
		
		

	}

}
