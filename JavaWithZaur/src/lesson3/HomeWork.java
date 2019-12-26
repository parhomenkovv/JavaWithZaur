package lesson3;

public class HomeWork {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		int a1 = a-- - --a + ++a + a++ + a;
		int b2 = ++b - b++ + ++b - --b;
		System.out.println(a1);
		System.out.println(b2);
/////////////////////////////////////////
		int i1 = 5;
		int i2 = 11;
		double d1 = 5.5;
		double d2 = 1.3;
		long L = 20L;
		double result = 0;
		result = i2 / d1 + d2 % i1 - L;
		System.out.println(result);

	}

}
