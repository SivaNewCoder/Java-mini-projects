import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number:");
        int num1 = input.nextInt();

        input.nextLine();

        System.out.println("Enter the Operator:");
        String sign = input.nextLine();
     
        System.out.println("Enter Second Number:");
        int num2 = input.nextInt();

        int answer = 0;
        boolean calculation = false;
        
        switch (sign) {
            case "+": 
                answer = num1 + num2;
                calculation = true;
                break;

            case "-": 
                answer = num1 - num2;
                calculation = true;
                break;

            case "*": 
                answer = num1 * num2;
                calculation = true;
                break;

            case "%": 
                if (num2 == 0) {
                    System.out.println("Anything can not divide by 0");
                } else {
                    answer = num1 % num2;
                    calculation = true;
                }
                break;

            case "/": 
                if (num2 == 0) {
                    System.out.println("Anything can not divide by 0");
                } else {
                    answer = num1 / num2;
                    calculation = true;
                }
                break;

            default : 
                System.out.println("Invalid Operator.");
        }

        System.out.println("First Number: " + num1);
        System.out.println("Operator Sign: " + sign);
        System.out.println("Second Number: " + num2);

        if (calculation == true){
            System.out.println("Answer: " + answer);
        }
        
        input.close();
    }
}