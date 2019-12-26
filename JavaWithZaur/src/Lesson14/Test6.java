package Lesson14;

public class Test6 {

	// method
	public void time() {
// OUTER is label of loop
		OUTER: for (int chas = 0; chas <= 23; chas++) {
			System.out.println("outer loop start");

			INNER: for (int minuta = 0; minuta <= 59; minuta++) {

				// for (int secunda = 0; secunda <= 59; secunda++) {
				System.out.println(chas + ":" + minuta);// + ":" + secunda);
				if (minuta == 30) {
					continue OUTER;
				}
			}
			// }
			System.out.println("End of outer loop ");
		}
	}

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.time();

	}

}
