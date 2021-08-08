package try_with_resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("oh no!");
	}
	
	
	
}



public class TryWithResources01 {
	
public static void main(String[] args) {
//	try(Temp temp=new Temp()) {
//		
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	File file=new File("text.txt");
	try (BufferedReader br=new BufferedReader(new FileReader(file))){
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
	
}
}
