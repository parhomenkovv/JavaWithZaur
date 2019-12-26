package Lesson17;

public class HomeWork {

	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();

	void ravenstvo(int sb1, int sb2) {
		if (sb1 == sb2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		HomeWork a = new HomeWork();
		a.ravenstvo(13, 123);
	}

}
