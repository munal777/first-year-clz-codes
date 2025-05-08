package problemSolving.bankAccount;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (balance >= 0)
        {
        this.balance = balance;
        }
        else
        {
            this.balance = 0;
            System.out.println("Your balance can't be negative, setting 0.");
        }
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount)
    {
        
        if (amount < 0)
        {
            System.out.println("Your deposit should be positive.");
            System.out.println();
        }
        else
        {
            balance += amount;
        }
        
        
    }
    public void withdraw(double amount)
    {
        if (amount <= balance  && amount > 0)
        {
            balance -= amount;
            
        }
        else
        {
            System.out.println("Your withdraw has been unsuccessful.\n");
        }
    }

    @Override
    public String toString() {
        return "Account Number: "+accountNumber+"\nAccountHolderName: "+accountHolderName +
        "\nBalance: "+ balance;
    }

    public static void main(String[] args) {
        BankAccount user1 = new  BankAccount("010024521", "Munal Poudel", 500.0);
        user1.deposit(-1000);
        user1.withdraw(1350);
        System.out.println(user1.toString());
    }
}
