
import java.time.LocalDate;
import  java.time.LocalDateTime;
 class Account {
	private int accountNo;
	private LocalDate opendate; 
	private double balance;
	private String accountholdername;
	private String accounttype;
	public Account() {}
	public Account(int accountNo, double balance,String accountholdername,String accounttype) {
		this.accountNo = accountNo;
		//this.opendate = opendate;
		this.balance = balance;
		this. accountholdername= accountholdername;
		this. accounttype = accounttype;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public LocalDate getOpendate() {
		return opendate;
	}
	public void setOpendate(LocalDate opendate) {
		this.opendate = opendate;
	} 
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}





}