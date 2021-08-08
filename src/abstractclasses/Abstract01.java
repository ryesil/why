package abstractclasses;

public class Abstract01 {
public static void main(String[] args) {
	
	Car car1=new Car();
car1.setId(3);

Camera cam1=new Camera();

car1.run();
cam1.run();

Camera cam2=new Camera();
cam2.run();

}
}
