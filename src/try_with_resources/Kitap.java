package try_with_resources;
class Defter implements AutoCloseable{
	@Override
	public void close() throws Exception{
		System.out.println("Over!");
	}
}
public class Kitap {
public static void main(String[] args) {
	try(Defter defter=new Defter()){
		
	} catch (Exception e) {
		System.out.println(e);
		e.getStackTrace();
	}
}
}

