package lesson4;

public class Car {

	String color = "red";
	String engine = "V6";
}

class carTest {
	public static void main(String[] args) {
		int a;
		Car car1 = new Car();
		car1.color = "black";
		car1.engine = "V8";
		System.out.println("Cvet: " + car1.color);
		System.out.println("Motor: " + car1.engine);

	}

}
