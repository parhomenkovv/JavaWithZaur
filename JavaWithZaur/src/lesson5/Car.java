package lesson5;

public class Car {
	Car(String cvet, String motor) {
		color = cvet;
		engine = motor;
	}

	String color;
	String engine;

	public static void main(String[] args) {
		Car car1 = new Car("yellow", "V6");
		System.out.println(car1.color);
		System.out.println(car1.engine);

	}
}
