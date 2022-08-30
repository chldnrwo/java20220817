package ch06.book.exercise19;

public class Account {
	private int account;

	public int getBalance() {
		return account;
	}

	public void setBalance(int account) {
		if(0<=account&&account<=1_000_000) {
			this.account = account;
		}
	}
}
