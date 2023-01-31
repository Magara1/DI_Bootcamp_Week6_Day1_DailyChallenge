package person;

public class Person {
	
	private  String name = "Magara";
	private  int age = 28;
	private  double salary= 650000;
	
	
	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = -1;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void displayInfo() {
		System.out.println("The name of the person is" + name);
		System.out.println("The age of the person is" + age);
		System.out.println("The salary of the person is" + salary);
	}
	
	public static void main(String[] args) {
		
		Person objectPerson1 = new Person();
		Person objectPerson2 = new Person("Magara",28,650000);
		
		Person objectPerson3 = new Person("Genevieve",30);
		
		
		objectPerson1.displayInfo();
		objectPerson2.displayInfo();
		
		objectPerson3.displayInfo();
		
		if(objectPerson3.salary == -1) {
			System.out.println("Salary not provided");
		}
	}


	

	
	

}
