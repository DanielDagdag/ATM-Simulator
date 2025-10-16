import java.util.Scanner;

public class BDO {

    static Scanner input = new Scanner(System.in);
    static float balance = 0;

    public static void main(String[] args)
    {
        System.out.println("Welcome to BDO");
        System.out.print("Please enter your PIN: ");
        int pin = input.nextInt();

        int myPin = 1235;

        if (pin != myPin)
        {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int choice = 0;

        while (choice != 4)
        {
            System.out.println();
            System.out.print("""
                    --- ATM Menu ---
                    1. Check Balance
                    2. Deposit Money
                    3. Withdraw Money
                    4. Exit""");
            System.out.print("\nEnter your choice (1-4): ");
            choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    currentBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Input is invalid!");
            }
        }
        input.close();
    }

    public static void currentBalance()
    {
        System.out.println("Your current balance is $" + balance);
    }

    public static void depositMoney()
    {
        System.out.print("Enter amount to dposit: ");
        float deposit = input.nextFloat();
        balance += deposit;
        System.out.println("$" + deposit + " deposited successfully");
        System.out.println("Your new balance is $" + balance);
    }

    public static void withdrawMoney()
    {
        System.out.print("Enter amount to withdraw: ");
        float withdraw = input.nextFloat();

        if (withdraw > balance)
        {
            System.out.println("Insufficient Balance!");
            return;
        }

        balance -= withdraw;
        System.out.println("$" + balance + " withdrawn successfully");
        System.out.println("Your remaining balance is $" + balance);
    }

    public static void exit()
    {
        System.out.println("Thank you for using BDO ATM.");
        System.exit(0);
    }
}
