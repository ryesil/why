package the_equal;

public class CircleRunner {

	public static void main(String[] args) {
		Circle[] circleArray=new Circle[12];
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle(i+1);
		}
		Rectangle rec3=new Rectangle();
		Rectangle rec1=new Rectangle(4,40);
		Rectangle rec2=new Rectangle(3.5,35.9);
		
		System.out.println(rec1.getArea());
		System.out.println(rec1.getPerimeter());
		System.out.println(rec2.getArea());
		System.out.println(rec2.getPerimeter());
		System.out.println(rec3.getArea());
	}
}
