package class09_OOP;

public class Sam {

	public static void main(String[] args) {
		Account Employee = new Account(1, "Sam Harry", (long)9722348713l, 6457 Eagle Road, Apt 3E, Jamaica, NY, 11432);
		
		System.out.println("accId " + Employee.accId);
		System.out.println("accName " + Employee.accName);
		System.out.println("accphone " + Employee.accphone);
		System.out.println("accAddress " +Employee.accAddress1);
		System.out.println("accCity " + Employee.accAddress2);
		System.out.println("accState " + Employee.accCity);
		System.out.println("accZip " + Employee.accZip);
		
	}

}
