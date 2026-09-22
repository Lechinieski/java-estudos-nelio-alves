package entities;

public class Account {

	private Integer number;
	private String holder;
	private double balance; 
	private double withdraw;
	
	public Account() {
	}

	public Account(Integer number, String holder, double balance, double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void addDeposit(double enterValue) {
		this.balance += enterValue;
	}

	public void withdraw(double saque) {
		this.balance -= saque + 5.0;
	}
	
}
