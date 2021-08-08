package the_equal;

class Person {
	
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}


public class TheEqual {
public static void main(String[] args) {
	
	System.out.println(new Object());
	
	
	Person person1=new Person(5,"Bob");
	Person person2=new Person(8,"Sue");
	Person person3=new Person(5,"Bob");
	System.out.println(person1.equals(person3));
	System.out.println(person1);
	
//	Double value1=7.2;
//	Double value2=7.2;
//	System.out.println(value1==value2);// false
//	
//	Integer number1=6;
//	Integer number2=6;
//	System.out.println(number1==number2);//True
	
	String text1="Hello";
	String text2="Hellodsfdghggfd".substring(0,5);
	System.out.println(text1==text2);//false This is trick. == is checking if both references refer to the same object or not Don't use it.
	//So text2 reference is not referring the same object. However. text1="Hello" and text2="Hello" so they are supposed to be equal but look at the result
	System.out.println(text1.equals(text2));//True
	
	
	
}
}