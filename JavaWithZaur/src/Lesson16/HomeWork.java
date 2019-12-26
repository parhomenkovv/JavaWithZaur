package Lesson16;

public class HomeWork {

	String s;

	void email(String s) {
		boolean b;
		if (b = s.contains("@yahoo.com")) {
			System.out.println("yahoo");
		}

		if (b = s.contains("@mail.ru")) {
			System.out.println("mail");
		}

		if (b = s.contains("@gmail.com")) {
			System.out.println("gmail");
		} else {
			System.out.println("your email not detected!");
		}

	}

	public static void main(String[] args) {

		HomeWork EmailDetector = new HomeWork();
		EmailDetector.email("yail.com");
	}
}
