package Lesson6;

public class Employee {
	// constructor creation
	Employee(int id2, String surname2, int age2) {
		id = id2;
		surname = surname2;
		age = age2;
	}

	// second the same constructor
	public Employee(String surname2, int age2) {
		surname = surname2;
		age = age2;
	}

	Employee(int id2, String surname2, int age2, double salary2, String department2) {
		id = id2;
		surname = surname2;
		age = age2;
		salary = salary2;
		department = department2;

	}

	// constructor for home work 7

	public Employee(int id2) {
		id = id2;
	}

	Employee(String surname2) {
		surname = surname2;
	}

	private Employee(double salary2) {
		salary = salary2;
	}

	int id;
	public String surname;
	int age;
	private double salary;
	String department;

	public static void main(String[] args) {
		// object creation for my constructors

		Employee emp1 = new Employee(1, "Ivanov", 25);
		System.out.println(emp1.id);
		Employee emp2 = new Employee("Petrov", 30);
		System.out.println(emp2.surname);
		Employee emp3 = new Employee(2, "Sidorov", 40, 100.35, "IT");
		System.out.println(emp3.department);
	}

	// HOME WORK method 1
	public void perviyMethod() {
		System.out.println("This is my salary" + salary);
	}

	// method 2
	public void vtoroyMethod() {
		System.out.println("My name is " + surname);
	}

	// method 3
	public void tritiyMethod() {
		System.out.println("this is my id " + id);
	}

}
