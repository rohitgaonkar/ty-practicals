package bank;

public class startbank {

	public static void main(String[] args) {
		BankAccount j =new BankAccount(8723);
		BankAccount r =new BankAccount(1974);

		j.deposit(900); 
		j.transfer(700,r);
		System.out.println(j.getBalance());
		System.out.println(j.getBalance());

	}

}
