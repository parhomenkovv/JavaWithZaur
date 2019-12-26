package Lesson6;

public class HomeWork {

	int vichislenie() {
		int result = 0;
		System.out.println("Summa vsex chisel; " + result);
		return result;

	}

	int vichislenie(int a1) {
		int result1 = a1;
		System.out.println("Summa vsex chisel; " + result1);
		return result1;
	}

	int vichislenie(int a2, int b2) {
		int result2 = a2 + b2;
		System.out.println("Summa vsex chisel; " + result2);
		return result2;
	}

	int vichislenie(int a3, int b3, int c3) {
		int result3 = a3 + b3 + c3;
		System.out.println("Summa vsex chisel; " + result3);
		return result3;
	}

	int vichislenie(int a4, int b4, int c4, int d4) {
		int result4 = a4 + b4 + c4 + d4;
		System.out.println("Summa vsex chisel; " + result4);
		return result4;
	}

	public static void main(String[] args) {
		HomeWork vichislenie = new HomeWork();
		int qaz = vichislenie.vichislenie(6, 4, 2);
		System.out.println(qaz);
		int qaz1 = vichislenie.vichislenie(9, 6, 2, 1);
		System.out.println(qaz1);

	}
}
