package entities;

public class SavingAccount extends Account{

	private Double interrestRate;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holder, Double balance, Double interrestRate) {
		super(number, holder, balance);
		this.interrestRate = interrestRate;
	}

	public Double getInterrestRate() {
		return interrestRate;
	}

	public void setInterrestRate(Double interrestRate) {
		this.interrestRate = interrestRate;
	}
	
	public void updateBalance() {
		balance += balance * interrestRate;
	}
	
}
