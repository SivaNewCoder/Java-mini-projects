import java.util.Scanner;

class Main{
    public static void main(String[] args){

        int mpin = 2134;
        int initialBalance = 20000;
        int balance;
        int withdrawalLimit;

        if(initialBalance >= 50000){
            withdrawalLimit = 20000;
        }else if(initialBalance >= 20000 && initialBalance < 50000){
            withdrawalLimit = 10000;
        }else{
            withdrawalLimit = 5000;
        }

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the PIN Number:");
        int enterPin = enter.nextInt();

        if(enterPin == mpin){

            System.out.println("Do you want to withdraw? Say Yes or No");
            enter.nextLine();
            String enterSRN = enter.next();

            if(enterSRN.equals("Yes")){
                
                System.out.println("Enter the amount value");
                int amountTake = enter.nextInt();

                if (amountTake <= 0) {
                    System.out.println("Invalid withdrawal amount");
                } else if (amountTake%100 != 0){
                    System.out.println("Amount must be in multiples of hundred");
                } else if (amountTake > withdrawalLimit){
                    System.out.println("Amount is higher than your withdrawal Limit");
                } else if (amountTake <= initialBalance){
                    balance = initialBalance - amountTake;
                    System.out.println("Take the Cash amount");
                    System.out.println("Your Account Balance:" + balance);
                    System.out.println("Your Transaction finished Successfully.");
                } else {
                    System.out.println("Insufficiant Balance.");
                }

            } else {

                System.out.println("Do you want to Deposite? Say Yes or No");
                String enteragainSRN = enter.next();
                if(enteragainSRN.equals("Yes")){
                    System.out.println("Enter the amount value");
                    int amountGive = enter.nextInt();
                    balance = amountGive + initialBalance;
                    System.out.println("Amount Deposited");
                    System.out.println("Your Account Balance:" + balance);
                    System.out.println("Your Transaction finished Successfully.");
                }else{
                    System.out.println("Your Transaction Cancelled.");
                }
            }

        }else{
            System.out.println("Incorrect PIN Number");
        }
        enter.close();
    }
}