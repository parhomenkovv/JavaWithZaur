package lesson5;

public class Employee {

	int id;
	String surname;
	int age;
	double salary;
	String department;

	// constructor creation with parameters
	Employee(int id2, String surname2, int age2, double salary2, String department2) {

		id = id2;
		surname = surname2;
		age = age2;
		salary = salary2;
		department = department2;
	}

	// method creation which increase salary
	double uvelichenieZarplati() {
		salary *= 2;
		return salary;
	}

	static class EmployeeTest {
		public static void main(String[] args) {
			Employee N = new Employee(1, "Ivanov", 25, 555.5, "IT");
			N.uvelichenieZarplati();
			System.out.println("Novaya zarplata " + N.surname + ":" + N.salary);

			Employee N2 = new Employee(2, "Petrov", 35, 888.8, "Sales");
			double newSalary = N2.uvelichenieZarplati();
			System.out.println("Novaya zarplata rabotnika " + N2.surname + ": " + newSalary);
		}
	}
}
