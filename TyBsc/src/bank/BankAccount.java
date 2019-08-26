package bank;

public class BankAccount {
	private long accountNumber;
	private double balance;
	  
	public BankAccount(long accountNumber) {
		 this.accountNumber = accountNumber;
		    balance=0;
	}
	
	public double getBalance() {
	    return balance;
	  }
	
	public void deposit(double amount) {
		   balance += amount;
		}
		
	public void withdraw(double amount) {
		   balance -= amount;
		}
		
		public void transfer(double amount,BankAccount targetAccount){
		   withdraw(amount);
		   targetAccount.deposit(amount);
		}
}
