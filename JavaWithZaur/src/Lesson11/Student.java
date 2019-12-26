package Lesson11;

public class Student {
	public String name;
	public int course;
	public double grade;

	// constructor
	public Student(String name, int course, double grade) {
		this.name = name;
		this.course = course;
		this.grade = grade;

	}

	public static void main(String[] args) {
		Student st1 = new Student("Ivan", 3, 9.5);
		Student st2 = new Student("Petro", 1, 5.3);

		int c1 = st1.course;
		int c2 = st2.course;
		double g1 = st1.grade;
		double g2 = st2.grade;
		String s1 = st1.name;
		String s2 = st2.name;

	}

}
