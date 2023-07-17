import java.time.LocalDateTime;

public class TestAccount {
	public static void main(String[] args)
	{
		//LocalDateTime opendate = new LocalDateTime(opendate.getDayOfMonth()+"/"+opendate.getMonth()+"/"+opendate.getYear());
		Bank1 b =new Bank1("State Bank of India","YGT",new Account[10]);
		b.addAccount(new Account(23456,25000,"Sruthi","sa"));
		b.addAccount(new Account(23466,45000,"Sushma","ca"));
		b.addAccount(new Account(23476,35000,"jaya","sa"));
		b.addAccount(new Account(23486,65000,"Sree","ca"));
		b.addAccount(new Account(23496,55000,"Chandu","sa"));
		b.addAccount(new Account(23496,75000,"Kala","sa"));
		b.addAccount(new Account(23356,95000,"Sai","ca"));
		b.addAccount(new Account(23556,85000,"Munna","sa"));
		b.addAccount(new Account(23656,15000,"ajay","ca"));
	    b.addAccount(new Account(23756,26000,"Ramu","ca"));
		b.showAccounts();
		try
		{
			//b.addAccount(new Account(33756,26000,"Rama","ca"));
			//b.transaction('w',23656,100000);
			b.transaction('w',23456,650000);
			//b.Nooftransactions(10);

		}
		catch(RuntimeException ex)
		{
			System.out.println(ex);
		}


	}

}