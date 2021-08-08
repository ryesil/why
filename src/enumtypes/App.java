package enumtypes;

public class App {

	
	public static void main(String[] args) {

	Animal animal=Animal.CAT;
		switch(animal) {
		case CAT:
			System.out.println("cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("mouse");
			break;
		default:
			break;
		}
		System.out.println(Animal.DOG.getName());
		System.out.println(Animal.DOG.toString());
		System.out.println(Animal.DOG);
		Animal animal2=Animal.valueOf("CAT");//supply string corresponding to the appropriate enum constant.
		System.out.println(animal2);
	}

}
