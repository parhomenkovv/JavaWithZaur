package Lesson7;

public class Employee {
	public double salary;

	// method
	public void dvoynayaZP() {
		System.out.println("Novaya z/p = " + salary);
	}

	// constructor
	public Employee(double salary2) {
		salary = salary2;
	}

	public static void main(String[] args) {
// object
		Employee emp = new Employee(500);
		System.out.println(emp.salary);
		emp.dvoynayaZP();
	}

}