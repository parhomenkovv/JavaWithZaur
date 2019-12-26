package lesson3;

public class Test5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		boolean c = !(a > b);
		// System.out.println(c);

		int x = 10;
		int y = 5;
		/*
		 * System.out.println(x & y); // 1010&0101=0000=0 System.out.println(x | y);//
		 * 1010|0101=1111 а если перевести с двоичной системы в десятиричную то будет 15
		 */
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = true;
		boolean b4 = true;
		System.out.println(b1 ^ b2 ^ b3 ^ b4);

	}

}
