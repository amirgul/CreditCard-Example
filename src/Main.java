import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        CreditCard amirCredidCard = new CreditCard();
       // amirCredidCard.deposit(10);
        double positiveAmount = amirCredidCard.withdraw();
        System.out.println("you withdrawn amount is: "+ positiveAmount);

    }
}
