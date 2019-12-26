package Lesson9;

public class Car {
	int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 5;
	public int z = 10;
	int $z = 15;

	String color;
	String engine;
	static int count;

//constructor
	public Car(String color, String engine) {
		count++;
		this.color = color;
		this.engine = engine;
	}

	// method
	public void ShowColor() {
		System.out.println("Cvet mashini: " + color);
	}

// method
	public void changeColor(String color3) {
		System.out.println("Cvet mashini izmenilsya");
		int cena = 5000;
		color = color3;
		cena += 1000;
	}

	public static void main(String[] args) {
		Car c = new Car("red", "V6");
		System.out.println(c.color);
		c.changeColor("black");
		System.out.println(c.color);
	}

}
