package p4;

import p1.A;
import p2.B;
import p3.C;
import p5.E;

public class D {

	public static void main(String[] args) {
		A perviyObject = new A();
		System.out.println(perviyObject.a);

		C vtoroyObject = new C();
		System.out.println(vtoroyObject.a);

		E tretiyObject = new E();
		System.out.println(tretiyObject.a);

		System.out.println(B.a);

	}

}
