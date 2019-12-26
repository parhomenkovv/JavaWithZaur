package lesson4;

public class BankAccount {

	int id = 10;
	String name = "Petro";
	double balance = 100;

	void popolnenieScheta(double SummaPopolneniya) {
		System.out.println("Balans do popolneniya: " + balance);
		System.out.println("Balans popolneniya: " + SummaPopolneniya);
		balance += SummaPopolneniya;
		System.out.println("Balans posle popolneniya: " + balance);
		System.out.println();
	}

	void snyatiyaSoScheta(double snyatiyaSoScheta) {
		System.out.println("Balans do popolneniya: " + balance);
		System.out.println("Balans popolneniya: " + snyatiyaSoScheta);
		balance += snyatiyaSoScheta;
		System.out.println("Balans posle popolneniya: " + balance);
		System.out.println();
	}

	public static void main(String[] args) {

		BankAccount MyAccount = new BankAccount();

		MyAccount.popolnenieScheta(30.5);
		MyAccount.snyatiyaSoScheta(20.5);

	}

}
