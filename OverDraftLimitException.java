class OverDraftLimitException extends RuntimeException {
	String message;

	public OverDraftLimitException() {}

	public OverDraftLimitException(String message) {
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
		return "overDraftLimitException :"+message;
	} 

}