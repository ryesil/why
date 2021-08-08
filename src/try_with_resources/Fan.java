package try_with_resources;

public class Fan {
public int slow=1;
public int medium=2;
public int fast=3;
private int speed=1;
private boolean isOn;
private double radius=5;
public String color="blue";

public int getSlow() {
	return slow;
}
public void setSlow(int slow) {
	this.slow = slow;
}
public int getMedium() {
	return medium;
}
public void setMedium(int medium) {
	this.medium = medium;
}
public int getFast() {
	return fast;
}
public void setFast(int fast) {
	this.fast = fast;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public boolean isOn() {
	return isOn;
}
public void setOn(boolean isOn) {
	this.isOn = isOn;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

public Fan() {
	
}

public String toString() {
	
	if(isOn) {
		return ""+getSpeed()+getColor()+getRadius();
	}else {
		return ""+getColor()+getRadius()+"fanIsOff";
	}
}




	
}
