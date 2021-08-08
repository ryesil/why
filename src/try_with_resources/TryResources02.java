package try_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Tur implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("Closing");
		throw new Exception("Oh no!!");
	}
}


public class TryResources02 {
public static void main(String[] args) {
	try(Tur tur=new Tur()) {
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	File file=new File("ben.txt");
	try (BufferedReader br=new BufferedReader(new FileReader(file))){
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	} catch (FileNotFoundException e) {
		System.out.println("File not found");
	} catch (IOException e1) {
		System.out.println("could't read the file");
	}
	
}
}
