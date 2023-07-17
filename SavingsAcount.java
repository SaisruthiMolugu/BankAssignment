class SavingsAccount extends Account {
	private double minimumDepositAmount ;
	private int nooftransactions;
	public SavingsAccount() {
	}

	public SavingsAccount(double minimumDepositAmount, int nooftransactions) {
		this.minimumDepositAmount = validateminimumDepsoitAmount(minimumDepositAmount);
		this.nooftransactions = validatenumberoftransactions(nooftransactions);
	}

	public double getMinimumDepositAmount() {
		return minimumDepositAmount;
	}

	public void setMinimumDepositAmount(double minimumDepositAmount) {
		this.minimumDepositAmount = validateminimumDepsoitAmount(minimumDepositAmount);
	}

	public int getNooftransactions() {
		return nooftransactions;
	}

	public void setNooftransactions(int nooftransactions) {
		this.nooftransactions = validatenumberoftransactions(nooftransactions);
	}
	private double validateminimumDepsoitAmount(double minimumDepositAmount)
	{
		if(minimumDepositAmount<1000)
			return minimumDepositAmount;
		throw new InsufficientBalanceException("There are insufficient funds in your account");
	}
	private int validatenumberoftransactions(int nooftransactions)
	{
		if(nooftransactions<100)
			return nooftransactions;
		throw new ReachedmaxnumberofTransactionExceptions("You have reached maximum transactions of today");
	}

}