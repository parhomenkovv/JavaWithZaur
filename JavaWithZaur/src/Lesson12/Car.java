package Lesson12;

public class Car {
	int engine;
	int doorCount;

	Car(int engine, int doorCount) {
		this.engine = engine;
		this.doorCount = doorCount;
	}

	public static void main(String[] args) {
		Car c1 = new Car(3, 4);
		Car c2 = new Car(2, 5);

		if (c1.engine > c2.engine) {
			if (c1.doorCount > c2.doorCount) {
				System.out.println("Moshnost motora i kolichestvo dverey u pervoy mashini bolshe");
			} else {
				System.out.println("Moshnost motora u pervoy mashini bolshe, a kolichestvo dverey menshe");
			}
		} else {
			System.out.println("Moshnost motora u pervoy mashini menshe");
		}
	}

}
