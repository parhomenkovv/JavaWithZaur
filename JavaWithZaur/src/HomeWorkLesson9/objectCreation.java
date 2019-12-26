package HomeWorkLesson9;

class objectCreation {
	public static void abc() {
		String s1 = new String("ABC");
		String s2 = new String("DEF");
	}

	public static void main(String[] args) {
		objectCreation l9 = new objectCreation();
		abc();
		abc();
		String s1 = new String("ABC");
		abc();
	}
}
