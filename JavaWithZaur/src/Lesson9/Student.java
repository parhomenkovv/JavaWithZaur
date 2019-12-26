package Lesson9;

public class Student {

}

class StudentTest {

	public static void main(String[] args) {
		
		// there was two objects created 
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3; // this object not created yet 
		st1 = null; // this object ready to be deleted from memory by GARBAGE COLLECTRO
	}
}