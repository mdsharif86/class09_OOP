package class09_OOP;

public class toyota {
	//class properties
	String vin;
	String color;
	int door;
	
	
	//here toyota () is a constructor
	// constructor is a special kind of Method
	// which does not have any return type
	toyota(String vin, String color, int door)  {
		this.vin=vin;
		this.color=color;
		this.door= door;
	}
	//method
	void run() {
		System.out.println("Running");
	}
	void stop() {
		System.out.println("Stopped");
	}

}//class