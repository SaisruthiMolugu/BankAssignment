 class ReachedmaxnumberofTransactionExceptions  extends RuntimeException{
	String message;

	public ReachedmaxnumberofTransactionExceptions() {}

	public ReachedmaxnumberofTransactionExceptions(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String toString()
	{
		return "ReachedmaxnumberofTransactionExceptions :"+message;
	}


	}
