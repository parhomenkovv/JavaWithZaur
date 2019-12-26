package Lesson8;

public class Student {
	String name;
	int course;
	static int count;// this variable is belong to whole class and all created objects
	int a;

	// constructor
	public Student(String name2, int course2) {
		count++;
		name = name2;
		course = course2;
		System.out.println("Student nomer " + count + " sozdan");
	}

	public void showCount() {
		System.out.println("Vsego sozdano studentov " + count);
	}

	void abc() {
		a++;
		count++; // you can increase static variable
	}

	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 1);
		Student st2 = new Student("Vasya", 4);
		Student st3 = new Student("Masha", 2);

		System.out.println(st1.name);
		System.out.println(Student.count);
		// method calling
		// NO NEED Object creation - because it is in the same class
		// showCount();
		st2.showCount();
	}

}
