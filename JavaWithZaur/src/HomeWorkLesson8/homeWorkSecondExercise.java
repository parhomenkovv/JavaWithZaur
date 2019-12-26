package HomeWorkLesson8;

public class homeWorkSecondExercise {

	public static final double P = 3.14;

	// non-static method
	public double ploschad(double radius) {
		double pl = P * radius * radius;
		return pl;
	}

	// static method
	public static double dlina(double radius2) {
		double dl = 2 * P * radius2;
		return dl;
	}

	public void info(double radius3) {
		System.out.println("Padius = " + radius3);
		System.out.println("Ploschad kruga = " + ploschad(radius3));
		System.out.println("Dlinna okruzznosti = " + dlina(radius3));
	}

	public static void main(String[] args) {
		homeWorkSecondExercise z = new homeWorkSecondExercise();
		z.ploschad(5);
		homeWorkSecondExercise.dlina(7.5);
		z.info(3);
	}
}

class vtoroy {

}
