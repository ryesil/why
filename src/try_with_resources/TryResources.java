package try_with_resources;
class Zeyno implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("Closing!");
	}
}

public class TryResources {
public static void main(String[] args) {
	try(Zeyno zeyno=new Zeyno()){
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
