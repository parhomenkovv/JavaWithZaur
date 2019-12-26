package lesson5;

public class Test7 {

	int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}

	int sredneeArifm(int a, int b, int c) {
		int result2 = (a + b + c) / 3;
		return result2;

	}

	public static void main(String[] arg) {
		Test7 t = new Test7();
		// int summaTrexChisel = t.sum(1, 2, 3);
		// System.out.println(summaTrexChisel);
		// System.out.println(t.sum(5, 10, 15));
		int sredneeArifmi = t.sredneeArifm(5, 10, 15);
		System.out.println(sredneeArifmi);

	}
}
