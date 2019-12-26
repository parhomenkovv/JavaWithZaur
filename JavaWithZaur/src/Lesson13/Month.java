package Lesson13;

public class Month {
// this method just show on a screen days of the month
	public static void dayCount(int a) {

		switch (a) {
		case 2:
			System.out.println("This month have 28 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("This month have 30 days");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("This month have 31 days");
			break;
		default:
			System.out.println("Such month not exist");
		}
	}

	public static void main(String[] args) {
		Month.dayCount(0);
		dayCount(4);
		dayCount(2);
		dayCount(-1);

	}

}
