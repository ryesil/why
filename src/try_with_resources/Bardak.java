package try_with_resources;

class Tabak implements AutoCloseable{
	
	@Override
	public void close() throws Exception{
		System.out.println("Closing!");
	}
}

public class Bardak {
public static void main(String[] args) {
	

	try(Tabak tabak=new Tabak()){
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}	
}
