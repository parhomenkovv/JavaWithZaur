package Lesson15;

public class HomeWork {

	public static void vremya() {
		// while loop
		int chas = 0;
		OUTER: while (chas < 6) {

			// DO WHILE LOOP
			int minuta = -1;
			MIDDLE: do {
				minuta++;
				if (chas > 1 && minuta % 10 == 0) {
					break OUTER;
				}

				// while loop
				int secunda = 0;
				INNER: while (secunda < 60) {
					if (secunda * chas > minuta) {
						continue MIDDLE;
					}
					System.out.println(chas + ":" + minuta + ":" + secunda);
					secunda++;
				}

			} while (minuta < 59);
			chas++;
		}
	}

	public static void main(String[] args) {

		HomeWork.vremya();
	}

}
