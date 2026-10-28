import java.util.Scanner;

public class Main {

    static int withdrawalLimit(int initialBalance){
         if (initialBalance >= 50000) {
            return 20000;
        } else if (initialBalance >= 20000) {
            return 10000;
        } else {
            return 5000;
        }
    }

    static boolean verify(int mpin, int enterPin){
       return mpin == enterPin;
    }
   
    static int withdraw(Scanner enter, int withdrawalLimit, int initialBalance){
        while(true){
            System.out.println("Enter the amount value");
            int amountTake = enter.nextInt();
            if (amountTake <= 0) {
                System.out.println("Invalid withdrawal amount");
            } else if (amountTake%100 != 0){
                System.out.println("Amount must be in multiples of hundred. Try again");
            } else if (amountTake > withdrawalLimit){
                System.out.println("Amount is higher than your withdrawal Limit");
            } else if (amountTake > initialBalance){
                System.out.println("Insufficiant Balance.");
            } else {
                initialBalance = initialBalance - amountTake;
                System.out.println("Take the Cash amount");
                System.out.println("Your Account Balance:" + initialBalance);
                System.out.println("Your Transaction finished Successfully.");
                break;
            }
        }
        return initialBalance;
    }

    static int deposite(Scanner enter, int initialBalance){
        while (true) {
            System.out.println("Enter the amount value");
            int amountGive = enter.nextInt();
            if (amountGive <= 0) {
                System.out.println("Invalid withdrawal amount. Try again");
            } else if (amountGive%100 != 0){
                System.out.println("Amount must be in multiples of hundred. Try again");
            }else{
            initialBalance = amountGive + initialBalance;
            System.out.println("Amount Deposited");
            System.out.println("Your Account Balance:" + initialBalance);
            System.out.println("Your Transaction finished Successfully.");
            break;
            }
        }
        return initialBalance;
    }
    public static void main(String[] args){
        System.out.println("ATM Transactions");
        System.out.println("----------------");

        int mpin = 1234;
        int initialBalance = 50000;

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the PIN Number:");
        int enterPin = enter.nextInt();

        while((!verify(mpin, enterPin))){
            System.out.println("Incorrect Pin.");
            System.out.println("Again Enter your Pin");
            enterPin = enter.nextInt();
        }
            
        int getWithdrawal = withdrawalLimit(initialBalance);

        System.out.println("Do you want to withdraw? Say Yes or No");
        String enterSRN = enter.next();

        if(enterSRN.equals("Yes") || enterSRN.equals("yes")){
            initialBalance = withdraw(enter, getWithdrawal, initialBalance);
        }else{
            System.out.println("Do you want to Deposite? Say Yes or No");
            String enteragainSRN = enter.next();
            if(enteragainSRN.equals("Yes") || enteragainSRN.equals("yes")){
                initialBalance = deposite(enter, initialBalance);
            }else{
                System.out.println("Your Transaction Cancelled.");
            }
        }
        enter.close();
    }
}