package abstractclasses;

public class Car extends Machine {

	public void start(){
	System.out.println("Starting car.");	
	
	}

	@Override
	public void doStuff() {
		System.out.println("Do stuff");
		
	}

	@Override
	public void shutDown() {
		System.out.println("shutting down");
		
	}


	}

