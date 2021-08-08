package try_with_resources;

class Sayar implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("HEY!!!");
	}
}

public class Bilgi {
public static void main(String[] args) {
	try(Sayar sayar=new Sayar()){
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
