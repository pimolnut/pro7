import java.util.Date;
import javax.lang.model.util.ElementScanner14;
class Account {
    protected int id = 0;
    protected double balance = 0.0;
    private static double annualInterestRate = 0.0;
    protected Date dateCreated;
    public Account(int id , double balance)
    {
        this.id = id;
        if(balance>0)
        {
            this.balance = balance;
        }
        dateCreated = new Date();
    }
    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }
    public int getId()
    {
        return this.id;  
    }
    public void setId(int id)
    {
        if(id>=0)
        {
            this.id = id;
        }
        else
        {
            System.out.println("your id error");
        }
    }
    public double getBalance()
    {
        return this.balance; 
    }
    public void setBalance(double balance)
    {
        if(balance>=0)
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("error");
        }
    }
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate; 
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        if(annualInterestRate >= 0)
        {
            this.annualInterestRate = annualInterestRate; 
        }
    }
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    public double getMonthlyInterestRate()
    {
         return annualInterestRate/12;
    }
    public double getMonthlyInterest()
    {
        return balance*getMonthlyInterestRate()/100;
    }
    public void withdraw(double amount)
    {

    }
    public void deposit(double amount)
    {
        if(amount > 0)
            balance = balance + amount;
        else
        {
            System.out.println("error");
        }
    }
    public String toString()
    {
        return "ID : " + id + "\nBalance : "+ balance + "\ncreated date : "+ dateCreated;
    }
}

class SavingsAccount extends Account
{
    public SavingsAccount() {
		super();
	}
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
} 
class CheckingAccount extends Account
{
    private double overdraftLimit = 5000.0 ;
    public void setOverdraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) 
    {   if(amount <= 0)
        {
            System.out.println("error");
        }
        else if(amount <= balance+overdraftLimit)
        {
            this.balance = balance-amount;
        }
        else
        {
            System.out.println("your balance not enough");
        }
    }
    public String toString()
    {
        return "Checking Account" + "\nOverdraft Limit : " + overdraftLimit + "\nBalance is : "+ balance ;  
    }
}
public class pro7_1 {
    public static void main(String[] args)
    {   
        CheckingAccount account = new CheckingAccount();
        account.deposit(5000);
        account.withdraw(10000.1);
        System.out.println(account);
        System.out.println("withdraw : 10000.00");
        System.out.println("This account was created at : " + account.dateCreated);
    }
}