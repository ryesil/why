package try_with_resources;

class Iste implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("Close!");
	}
	
}

public class Isteme {
public static void main(String[] args) {
	try(Iste iste=new Iste()){
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
