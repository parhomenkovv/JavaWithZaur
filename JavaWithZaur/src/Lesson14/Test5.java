package Lesson14;

public class Test5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i == 87) {
				continue;// this statement allow to skip 87 and continue
			}
			if (i % 55 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}
