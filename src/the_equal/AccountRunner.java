package the_equal;

public class AccountRunner {

	public static void main(String[] args) {
		Account acc1=new Account(1122,20000);
		Account.setAnnualInterestRate(4.5);
		System.out.println(acc1.getAnnualInterestRate());
		Account acc2=new Account(1123,200000);
		System.out.println(acc2.getAnnualInterestRate());
		System.out.println(acc1.getBalance());
		acc1.withdraw(2500);
		System.out.println(acc1.getBalance());
		acc1.deposit(3000);
		System.out.println(acc1.getBalance());
		acc1.withdraw(23000);
		System.out.println(Account.monthlyInterestRate());
		
	}

}
