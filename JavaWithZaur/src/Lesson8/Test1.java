package Lesson8;

public class Test1 {

	public final int a; // instance variable

	Test1() {
		a = 10;
	}

	Test1(boolean b) {
		a = 25; // why a can be 15? it is final constant
	}

	public static void main(String[] args) {
		Test1 t = new Test1();
		// t.a = t.a * 2;
		System.out.println(t.a);

	}

}
