package the_equal;

public class Rectangle {
	
double width=1;
double length=1;

public Rectangle() {
	
}
public Rectangle(double width,double length) {
	this.width=width;
	this.length=length;
}

public double getArea() {
	return width*length;
}

public double getPerimeter() {
	return 2*(width+length);
}


}
