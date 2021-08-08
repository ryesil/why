package try_with_resources;

public class RegularPolygonRunner {

	public static void main(String[] args) {
	
		/*
		 creates three RegularPolygon objects, created using the no-arg
constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
4, 5.6, 7.8). For each object, display its perimeter and area.
		 */
		RegularPolygon reg1=new RegularPolygon();
		RegularPolygon reg2=new RegularPolygon(6,4);
		RegularPolygon reg3=new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println(reg1.getArea());
		System.out.println(reg2.getArea());
		System.out.println(reg3.getArea());
		System.out.println(reg2.getN());
	}

}
