package class09_OOP;



public class Karim {
	

	public static void main(String[] args) {
		 //object variable
		Person Employee = new Person(1, "Karim Ali", 54, 12403, 19172574204l, 58.00, 6000.00, 'M', true );
		
		System.out.println("id = " + Employee.id );
		System.out.println("name = " + Employee.name);
		System.out.println("age = " + Employee.age);
		System.out.println("hoursWorked = " + Employee.hoursWorked);
		System.out.println("bonus=" + Employee.bonus);
		System.out.println("gender" + Employee.gender);
		System.out.println("isMarried" + Employee.isMarried);
		
		Person Employee1 = new Person(2, "Joe Namichek", 65, 13231, 19172570000l, 65.00, 12999.00, 'm', false);
		
		System.out.println("id" + Employee1.id);
		System.out.println("name" + Employee1.name);
		System.out.println("age" + Employee1.age);
		System.out.println("hoursWorked" + Employee1.hoursWorked);
		System.out.println("phone" + Employee1.phone);
		System.out.println("hourRate" + Employee1.hoursRate);
		System.out.println("bonus" + Employee1.bonus);
		System.out.println("gender" + Employee1.gender);
		System.out.println("isMarried" + Employee1.isMarried);
		
		
		
		
		
		

	}//main

}//class
