package try_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App3 {
public static void main(String[] args) {
	
	File file=new File("ben.txt");
	
	try (BufferedReader br=new BufferedReader(new FileReader(file))){
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("File not found :"+file.toString());
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
}
}
