package SampleApplication;
abstract class Account
{
	final static String BankName = "Caren Bank of TamilNadu";
	final int AcNo;
	final String AcHoldName;
	double AcBal;
	
	Account(int AcNo,String AcHoldName, double AcBal)
	{
		this.AcNo = AcNo;
		this.AcBal = AcBal;
		this.AcHoldName = AcHoldName;
	}
	Account(int AcNo,String AcHoldName)
	{
		this(AcNo,AcHoldName,0.0);
	}
	abstract void deposit (double amt);
	abstract void withdraw(double  amt);
	final void BalanceEnquiry()
	{
		System.out.println("Your Account Balance = "+AcBal);
	}
	
	
}

class SavingsAccount extends Account
{
	{
		System.out.println("Your Initial Account opening bal = "+AcBal);
	}
	SavingsAccount(int AcNo, String AcHoldName,double AcBal) 
	{
		super( AcNo, AcHoldName, AcBal);
		System.out.println();
	}
	SavingsAccount(int  AcNo, String AcHoldName)
	{
		super(AcNo,AcHoldName);
	}
	void deposit (double amt)
	{
		if(amt>0)
		{
			System.out.println("Deposit Amount in Savings Account = "+amt);
			AcBal = AcBal+amt;
			BalanceEnquiry();
		}
		else
		{
			System.out.println("Enter Valid Amount");
		}
	}
	void withdraw(double amt)
	{
		if(amt<50000)
		{

			if(amt>0 && amt<=AcBal)
			{
				System.out.println("Withdraw Amount in SavingsAccount = "+amt);
				AcBal = AcBal-amt;
				BalanceEnquiry();
			}
			else
			{
				System.out.println("Enter Valid Amount");
			}
		}
		else
		{
			System.out.println("Your maximum withdraw limit is below 50000......!");
			System.out.println("Update your  PAN details for no limitation for withdrawal");
		}
	}
}
class LoanAccount extends Account
{
	{
		System.out.println("Your Initial loan Ac bal = "+AcBal);
	}
	LoanAccount(int AcNo, String AcHoldName,double AcBal) 
	{
		super( AcNo, AcHoldName, AcBal);
		System.out.println();
	}
	LoanAccount(int  AcNo, String AcHoldName)
	{
		super(AcNo,AcHoldName);
	}
	void deposit (double amt)
	{
		if(amt>0)
		{
			System.out.println("Deposit Amount in LoanAccount = "+amt);
			AcBal = AcBal-amt;
			BalanceEnquiry();
		}
		else 
		{
			System.out.println("Enter Valid Amount");
		}
		
	}
	void withdraw(double amt)
	{
		if(amt<50000)
		{
			if(amt>0)
			{
				System.out.println("Withdraw Amount in LoanAccount = "+amt);
				AcBal = AcBal+amt;
				BalanceEnquiry();
			}
			else 
			{
				System.out.println("Enter Valid Amount");
			}
		}
		else {
			System.out.println("Your maximum withdraw limit is below 50000......!");
			System.out.println("Update your  PAN details for no limitation for withdrawal");
		}
	}
}
public class App1 {

	public static void main(String[] args) {
		System.out.println("Welcome to "+Account.BankName);
		SavingsAccount s1 =new SavingsAccount(1001,"Lulu",1000);
		s1.deposit(100000.0);
		s1.withdraw(50000.0);
		System.out.println();
		System.out.println("Welcome to "+Account.BankName);
		LoanAccount l1 = new LoanAccount(1002, "Aina",10000);
		l1.withdraw(50000.0);
		l1.deposit(4000.0);
	}
}

