package the_equal;

import java.sql.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		
	}
	public Account(int id, double balance) {
		this.id=id;
		this.balance=balance;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated=dateCreated;
	}
	
	public static double monthlyInterestRate() {
		return annualInterestRate/12;
		
	}
	
	public double deposit(double deposit) {
		return balance+=deposit;
	}
	public double monthlyInterest() {
		return balance*monthlyInterestRate()/100;
		
	}
	public double withdraw(double withdraw) {
		if((this.balance-withdraw)>=0) {
			this.balance-=withdraw;
		} else {
			System.out.println("The balace is "+balance+"\nCannot withdraw "+withdraw);
		}
		
		
		return balance;
	}
	
}
