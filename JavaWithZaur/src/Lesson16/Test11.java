package Lesson16;

public class Test11 {
	// isBlank
	// isEmpty
	// strip, stripLeading, stripTrailing

	public static void main(String[] args) {
		/*
		 * // returns FALSE because NO space in a string String s1 = "Privet";
		 * System.out.println(s1.isBlank());
		 * 
		 * // returns TRUE because there is space on a string String s2 = " ";
		 * System.out.println(s2.isBlank());
		 * 
		 * String s3 = null; System.out.println(s3.isEmpty());
		 */
		// analog trim, strip remove empty spaces
		String s4 = "     privet     ";
		// System.out.println(s4.strip());

		String s5 = "poka";
		String s6 = s5.strip();
		System.out.println(s5 == s6);

	}

}
