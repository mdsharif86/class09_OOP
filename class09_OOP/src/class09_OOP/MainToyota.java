package class09_OOP;

public class MainToyota {

	public static void main(String[] args) {
		toyota camry; //declare as a object variable
		camry = new toyota("A1", "Red", 4); //Instantitiate
		System.out.println("after camry instantiate");
		System.out.println("vin is" + camry.vin);
		System.out.println("color is" +camry.color);
		System.out.println("door is" + camry.door);
		
		camry.run();
		
		toyota corolla;
		corolla =new toyota("B1", "Blue", 2);
		System.out.println("after corolla instantiate");
		System.out.println("vin is" + corolla.vin);
		System.out.println("color is" +corolla.color);
		System.out.println("door is" + corolla.door);
		
		
		/*
		camry.vin ="A1";
		camry.color="Red";
		camry.door=4;
		System.out.println("after assigning values");
		System.out.println("vin is" + camry.vin);
		System.out.println("color is" +camry.color);
		System.out.println("door is" + camry.door);
		*/
	}

} 
