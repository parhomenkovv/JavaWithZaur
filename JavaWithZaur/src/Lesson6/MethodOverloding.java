package Lesson6;

public class MethodOverloding {
	void show(int i1) {
		System.out.println(i1);
		System.out.println("Data type is int");
	}

	// methods needs to be unique
	void show(int a, int b) {
		System.out.println(a);
		System.out.println("Data type is int");
	}

	void show(boolean b1) {
		System.out.println(b1);
		System.out.println("Data type is boolean");
	}

	void show(String s1) {
		System.out.println(s1);
		System.out.println("Data type is String");
	}

	void show(String s, int a) {
		System.out.println("String :" + s + " " + "int :" + a);
	}

	void show(int a, String s) {
		System.out.println("what a beautiful day!");
	}

	public static void main(String[] args) {

		MethodOverloding mO = new MethodOverloding();
		// compiler will recognize method by name and data type of parameter
		int a = 800;
		mO.show(a);

		boolean b = true;
		mO.show(b);

		String s = "Privet";
		mO.show(s);

		mO.show(s);
		mO.show("Privet", 10);

	}

}
