package HomeWorkLesson8;

public class homeWork {

	static int MethodPerviy(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}

	static void MethodVtoroy(double d, double e) {
		double result2 = d / e;
		System.out.println(result2);
		// how to print %
		System.out.println("vot tak mi vivodom ostatoc " + d % e);
	}

	public static void main(String[] args) {
		System.out.println(homeWork.MethodPerviy(2, 4, 6));
		homeWork.MethodVtoroy(12.5, 2.5);

		System.out.println(homeWork.MethodPerviy(8, 10, 12));
		homeWork.MethodVtoroy(19, 2);

	}
}

class homeWork2 {

}