package try_with_resources;

class Xena implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("Closing!");
		throw new Exception("ALI baba");
	}
}

public class Zul {
public static void main(String[] args) {
	
	try(Xena xena=new Xena()){
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
