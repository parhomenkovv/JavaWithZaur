package HomeWorkLesson11;

public class Car {

	String color;
	String engine;
	int doors;

	// constructor
	Car(String color, String engine, int doors) {
		this.color = color;
		this.doors = doors;
		this.engine = engine;
	}

	void doorschange(Car c, int doors) {
		c.doors = doors;

	}

	void colorchange(Car c1, Car c2) {
		String color = c1.color;
		c1.color = c2.color;
		c2.color = color;
	}

	public static void main(String[] args) {
		// Car ct = new Car();
		Car c1 = new Car("Black", "V4", 5);
		Car c2 = new Car("Blue", "V6", 3);
		c1.doorschange(c1, 3);
		c2.colorchange(c1, c2);
		System.out.println(
				"Info about first car: Color " + c1.color + " engine is: " + c1.engine + " door quantity: " + c1.doors);
		System.out.println("Info about second car: Color " + c2.color + " engine is: " + c2.engine + " door quantity: "
				+ c2.doors);
	}

}
