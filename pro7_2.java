import java.util.Date;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
class Account
{
    protected int id;
    protected String name;
    protected double balance;
    protected static double annualInterestRate = 0.0;
    protected Date dateCreated;
    protected ArrayList<Transaction> transactions = new ArrayList<Transaction>(); 

    public Account(int id , double balance)
    {
        this.id = id;
        if(balance>0)
        {
            this.balance = balance;
        }
        dateCreated = new Date();
    }
    public Account(String name,int id, double balance)
    {
        this.id = 0;
        this.balance = 0;
        this.name = name;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public int getId()
    {
        return this.id;  //accessor methods
    }
    public void setId(int id)
    {
        if(id>=0)
        {
            this.id = id; //mutator methods
        }
        else
        {
            System.out.println("your id error");
        }
    }
    public double getBalance()
    {
        return this.balance; //accessor methods
    }
    public void setBalance(double balance)
    {
        if(balance>=0)
        {
            this.balance = balance; //mutator methods
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

    public void withdraw( double amount )
    {
        if(amount>=0 && amount <= balance)
        {
            balance  = balance - amount;
            Transaction transaction = new Transaction('W', amount , balance, "");
            transactions.add(transaction);
        }
    }
    public void deposit( double amount )
    {
        if(amount>=0)
        {
            balance = balance + amount;
            Transaction transaction = new Transaction('D', amount , balance, "");
            transactions.add(transaction);
        }
    }
    public ArrayList<Transaction> getTransactions()
    {
        return transactions;
    }
    public String toString()
    {   
        return "Name: George " + "\nAccount Id: " + id;
    }
}
class Transaction
{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;


    public Transaction(char type, double amount, double balance, String description )
    {
        this.setType(type);
        this.amount = amount;
        this.balance = balance;
        this.setDescription(description);

        this.setDate(new Date());
    }
    public double getBalance() 
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public double getAmount() 
    {
        return amount;
    }
    public void setAmount(double amount) 
    {
        this.amount = amount;
    }
    public char getType() 
    {
        return type;
    }
    public void setType(char type) 
    {
        this.type = type;
    }
    public Date getDate() 
    {
        return date;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }
    public String getDescription() 
    {
        return description;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }
}
public class pro7_2 {
    public static void main(String[] args)
    {
        Account account = new Account(1122,1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);

        System.out.println("Annual interest rate: "+account.getAnnualInterestRate() +"%");
        System.out.println(String.format("%.2f", +account.getBalance()));

        System.out.format("%1s %42s %13s %14s","Date","Type","Amount","Balance");
        System.out.println();
        for(int i = 0; i<account.getTransactions().size(); i++){
            System.out.format("%2s %15s %15s %15s",account.getTransactions().get(i).getDate(),account.getTransactions().get(i).getType(),String.format("%.2f",account.getTransactions().get(i).getAmount()),String.format("%.2f",account.getTransactions().get(i).getBalance()));
            System.out.println();
        }
                   
        
    }
}