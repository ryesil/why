package abstractclasses;

public abstract class Machine {
	private int id;


	public int getId() {
		return id;
	}

	public int setId(int id) {
		this.id = id;
		return id;
	}
	
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutDown();
	
	public void run() {
	start();
	doStuff();
	shutDown();
	}
}
