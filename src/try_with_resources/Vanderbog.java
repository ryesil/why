package try_with_resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Vanderbog {
public static void main(String[] args) {
	
	File file=new File("tt.txt");
	try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
		bw.write("I am Ramazan Yesil");
		bw.newLine();
		bw.write("My home address is:");
		bw.newLine();
		bw.write("null");
		
	} catch (IOException e) {
	System.out.println("Unable to read! "+file.toString());
	}
}
}
