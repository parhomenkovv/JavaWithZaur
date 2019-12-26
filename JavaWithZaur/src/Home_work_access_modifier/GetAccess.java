package Home_work_access_modifier;

public class GetAccess {

	public static void main(String[] args) {

		Lesson6.Employee qaz = new Lesson6.Employee(14);
		System.out.println("This is access to my method " + qaz);

		Lesson6.Employee qaz2 = new Lesson6.Employee("Vasya");
		System.out.println("This is access to default method " + qaz2);

		Lesson6.Employee qaz3 = new Lesson6.Employee(500.00);
		System.out.println("This is access to private modifier" + qaz3);

	}

}
