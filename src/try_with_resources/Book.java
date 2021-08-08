package try_with_resources;

class Booklet implements AutoCloseable{
	
	@Override
	public void close() throws Exception{
	System.out.println("Close");	
	}
}

public class Book {
	public static void main(String[] args) {
try(Booklet book=new Booklet()){
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}