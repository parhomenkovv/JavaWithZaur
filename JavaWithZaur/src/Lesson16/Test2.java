package Lesson16;

public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("privet");
		/*
		 * // this method start count after 3 String s10 = s1.substring(3);
		 * System.out.println(s10); System.out.println(s1);
		 * 
		 * // show string between // last one not count String s11 = s1.substring(3, 7);
		 * System.out.println(s11);
		 * 
		 * // remove spaces String s12 = s1.trim(); System.out.println(s12);
		 * 
		 * // in order to show last index on a string use +1 index(11) String s13 =
		 * s1.substring(3, 11); System.out.println(s13);
		 */
		// replace something to something
		String s14 = s1.replace('a', 'z');
		System.out.println(s14);

		String s15 = s1.replace("abc", "xyz");
		System.out.println(s15);

		String s2 = "poka";
		String s3 = s2.replace("k", "K");
		System.out.println(s1 == s14);

		String s5 = "privet, ";
		String s6 = "drug";
		System.out.println(s5 + s6);

	}

}
