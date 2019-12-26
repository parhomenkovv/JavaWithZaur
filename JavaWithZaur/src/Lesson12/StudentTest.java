package Lesson12;

import Lesson11.Student;

public class StudentTest {

	// method one with two objects as parameters

	public static void sravnenie1(Student st1, Student st2) {
		if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade)
			System.out.println("students are the same");
		else {
			System.out.println("students are differend ");
		}
	}

// method two
	public static void sravnenie2NESTED(Student st1, Student st2) {
		if (st1.name.equals(st2.name)) {
			if (st1.course == st2.course) {
				if (st1.grade == st2.grade) {
					System.out.println("Names, courses and grades are the same");
				} else {
					System.out.println("Names and courses are the same but grade is differend");
				}
			} else {
				System.out.println("names are the same but courses and grades are differend ");
			}
		} else {
			System.out.println("names are differend");
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student("Ivan", 2, 5.5);
		Student s2 = new Student("Ivan", 3, 5.5);
		sravnenie1(s1, s2);
		sravnenie2NESTED(s1, s2);
	}

}
