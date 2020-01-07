import java.util.Scanner;

public class CreditCard
{
    private double savingAccountBalance;
    private double checkingAccounBalancet;
    private long credidCardNumber;
    private String cardType;
    private String cardHolderName;
    private double cardExpirationDate;
    private int cardSecurityCode;
    private double balance;
    public void deposit(double amount)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your total balance: ");
        balance = keyboard.nextDouble();
        System.out.println("And you are depoiting: "+ amount);
        double myDeposit = amount;
        balance = balance + amount;
        System.out.println("Your new balance after deposit is: " + balance);
    }

    public double withdraw()
    {
        System.out.println("The amount only will be withdraw if withdraw amount is less than total balance");
        System.out.println("please enter withdraw amount");
        double result = 0;
        Scanner keyboard = new Scanner(System.in);
        double withdraw = keyboard.nextDouble();
        System.out.println("While your total balance is: "+ balance);
        if(withdraw > balance)
        {
            System.out.println("Sorry withdraw amount is greater than total balance");

        }
        else
        {
            balance = balance - withdraw;
            System.out.println("withdrawn: "+ withdraw);
            System.out.println("Your new Balance is: "+ balance);

        }
        if(balance > 0)
            result = balance;

        return  result;

    }

}
