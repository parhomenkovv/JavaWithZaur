package Lesson13;

public class Employee {

	public static void main(String[] args) {
		int denNedeli = 2;
		final int a = 1;
		final int b = 2;
		switch (denNedeli) {
		case 1:
			// System.out.println("rabota do 18:00");
			// break;
		case -2:
			// System.out.println("rabota do 18:00");
			// break;
		case a * b:
			// System.out.println("rabota do 18:00");
			// break;
		case 4:
			// System.out.println("rabota do 18:00");
			// break;
		case 5:
			System.out.println("rabota do 18:00");
			break;
		case 6:
			System.out.println("rabota do 14:00");
			break;
		case 7:
			System.out.println("rabot net!");
			break;
		default:
			System.out.println("takogo dna net!");
		}

	}

}
