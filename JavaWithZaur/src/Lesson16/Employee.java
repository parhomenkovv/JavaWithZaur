package Lesson16;

public class Employee {

	double salary;
	boolean isManager;

	Employee(double salary, boolean isManager) {
		this.salary = salary;
		this.isManager = isManager;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(100.5, true);
		System.out.println("On manager? " + emp.isManager + "ego z/p" + emp.salary);

	}
}
