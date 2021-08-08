package try_with_resources;

public class FanRunner {

	public static void main(String[] args) {
	Fan fan1=new Fan();
	Fan fan2=new Fan();
	fan1.setSpeed(fan1.fast);
	System.out.println(fan1.getSpeed());
	fan1.setColor("blue");
	System.out.println(fan1.getColor());
fan1.setOn(true);
System.out.println(fan1.toString());
	fan2.setRadius(8);;
	fan2.setSpeed(fan2.medium);
	fan2.setOn(false);
	System.out.println(fan2.toString());
	
	
	}

}
