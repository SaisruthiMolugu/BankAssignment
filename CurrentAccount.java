 class CurrentAccount extends Account {
	 private int overdraftLimit = 0;

	public CurrentAccount() {	}

	public CurrentAccount(int overdraftLimit) {
		this.overdraftLimit = ValidateoverDraftLimit(overdraftLimit);
	}

	public int getOverDraftLimit() {
		return overdraftLimit;
	}

	public void setOverDraftLimit(int overDraftLimit) {
		this.overdraftLimit = ValidateoverDraftLimit(overDraftLimit);
	}

	private int ValidateoverDraftLimit(int overdraftLimit )
	{
		if(overdraftLimit <10000)
			return overdraftLimit;
		throw new OverDraftLimitException("You have reached the limit,no more funds can be given");
	}



}