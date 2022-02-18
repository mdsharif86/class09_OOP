package class09_OOP;

public class Person {
	int id;
	String name;
	int age;
	int hoursWorked;
	long phone;
	double hoursRate;
	double bonus;
	char gender;
	boolean isMarried;
	
	public Person(int id, String name, int age, int hoursWorked, long phone, double hoursRate, double bonus, char gender, boolean isMarried) {
		this.id = id;
		this.name= name;
		this.age= age;
		this.hoursWorked= hoursWorked;
		this.bonus = bonus;
		this.gender = gender;
		this.isMarried= isMarried;
	}
} //Class
