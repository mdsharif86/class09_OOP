package class09_OOP;

public class MainPerson{

	public static void main(String[] args) {
		 Person karim;  //object variable- declaration
		 karim = new Person(); //Initializing karim with person
		 //we are declaring an object variable name karim
		 //karim's data type is person
		 
		 int age;  //scaler variable- can only held one data
		 age = 5;  //Initializing age variable with value 5
		 System.out.println("age is" + age);
		 age =10;
		 System.out.println("now age is" + age);
		 System.out.println("id =" +karim.id);
		 karim.id= 1;
		 System.out.println("now id is" + karim.id);
		 
		 System.out.println("name is" + karim.name);
		 karim.name= "karim ali";
		 System.out.println("now name=" + karim.name);
		 
		 //now create Maria
		 
		 Person maria;
		 maria= new Person();
		 maria.id =2;
		 System.out.println("maria id is" + maria.id);

	}

}
