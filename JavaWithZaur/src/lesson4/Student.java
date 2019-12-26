package lesson4;

public class Student {

	Student(int StudentId2, String StudentFirstName2, String StudentLastName2, int StudentGrade2, int AverageMthScore2,
			int AverageEconomicsScore2, int AverageSecondLanguageScore2) {

		StudentId = StudentId2;
		StudentFirstName = StudentFirstName2;
		StudentLastName = StudentLastName2;
		StudentGrade = StudentGrade2;
		AverageMthScore = AverageMthScore2;
		AverageEconomicsScore = AverageEconomicsScore2;
		AverageSecondLanguageScore = AverageSecondLanguageScore2;
	}

	// overloaded constructor
	Student(int StudentId3, String StudentFirstName3, String StudentLastName3, int StudentGrade3) {
		this(StudentId3, StudentFirstName3, StudentLastName3, StudentGrade3, 0, 0, 0);
	}

	Student() {

	}

	int StudentId;
	String StudentFirstName;
	String StudentLastName;
	int StudentGrade;
	int AverageMthScore;
	int AverageEconomicsScore;
	int AverageSecondLanguageScore;

	class StudentTest {

		int sredArifmOcenka(Student st) {
			int sredOcenka = (st.AverageMthScore + st.AverageEconomicsScore + st.AverageSecondLanguageScore) / 3;
			System.out.println("Srednyaya arifm ocenka studenta " + st.StudentFirstName + " " + st.StudentLastName + " "
					+ sredOcenka);
			return sredOcenka;
		}
	}

	public static void main(String[] args) {

		Student St1 = new Student();
		St1.StudentId = 10;
		St1.StudentFirstName = "John";
		St1.StudentLastName = "Travolta";
		St1.StudentGrade = 2019;
		St1.AverageMthScore = 6;
		St1.AverageEconomicsScore = 7;
		St1.AverageSecondLanguageScore = 8;

		Student St2 = new Student();
		St2.AverageMthScore = 6;
		St2.AverageEconomicsScore = 9;
		St2.AverageSecondLanguageScore = 9;

		Student St3 = new Student(10, "Johny", "Depp", 10, 12, 15, 20);

		StudentTest sTest = new StudentTest();
		sTest.sredArifmOcenka(St1);
		sTest.sredArifmOcenka(St2);
		sTest.sredArifmOcenka(St3);
	}

}
