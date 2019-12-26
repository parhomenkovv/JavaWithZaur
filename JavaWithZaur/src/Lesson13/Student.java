package Lesson13;

public class Student {

	int ocenka;

	// constructor start with uppercase
	Student(int ocenka) {
		this.ocenka = ocenka;
	}

	public static void main(String[] args) {
		Student st = new Student(1);

		switch (st.ocenka) {
		case 2:
			System.out.println("Student dvoechnik");
			break;
		case 3:
			System.out.println("Student troechnic");
			break;
		case 4:
			System.out.println("Student xoroshist");
			break;
		case 5:
			System.out.println("student otlichnic!");
			break;
		default:
			System.out.println("Error! Nevernaya ocenca!");
		}

		/*
		 * if (st.ocenka == 2) { System.out.println("Student dvoechnik"); } else if
		 * (st.ocenka == 3) { System.out.println("Student troechnic"); } else if
		 * (st.ocenka == 4) { System.out.println("Student xoroshist"); } else if
		 * (st.ocenka == 5) { System.out.println("student otlichnic!"); } else {
		 * System.out.println("Error! Nevernaya ocenca!"); }
		 */
	}

}
