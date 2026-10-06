import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("===== Exam Result =====");
        System.out.println("");
        Scanner mark = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = mark.nextLine();
        
        System.out.println("Enter Tamil Mark:");
        int tamil = mark.nextInt();
        
        while(tamil <= 0 || tamil >= 100){
            System.out.println("Entered Mark Wrongly");
            System.out.println("Enter Tamil Mark Again");
            tamil = mark.nextInt();
        }
        
        System.out.println("Enter English Mark:");
        int english = mark.nextInt();
        
        while(english <= 0 || english >= 100){
            System.out.println("Entered Mark Wrongly");
            System.out.println("Enter English Mark Again");
            english = mark.nextInt();
        }
        
        System.out.println("Enter Maths Mark:");
        int maths = mark.nextInt();
        
        while(maths <= 0 || maths >= 100){
            System.out.println("Entered Mark Wrongly");
            System.out.println("Enter Maths Mark Again");
            maths = mark.nextInt();
        }
        
        System.out.println("Enter Science Mark:");
        int science = mark.nextInt();
        
        while(science <= 0 || science >= 100){
            System.out.println("Entered Mark Wrongly");
            System.out.println("Enter Science Mark Again");
            science = mark.nextInt();
        }
        
        System.out.println("Enter Social Mark:");
        int social = mark.nextInt();
        
        while(social <= 0 || social >= 100){
            System.out.println("Entered Mark Wrongly");
            System.out.println("Enter Social Mark Again");
            social = mark.nextInt();
        }
        System.out.println("");

        int total;
        float average;
        char grade;
        String result;

        total = tamil + english + maths + science + social;
        average = total/5;

        if (average >= 90 && average <= 100){
            grade = 'A';
        } else if (average >= 75 && average <= 89){
            grade  = 'B';
        } else if (average >= 50 && average <= 74){
            grade  = 'C';
        } else if (average >= 35 && average <= 49){
            grade  = 'E';
        } else {
            grade  = 'F';
        }

        if (tamil < 35 || english < 35 || maths < 35 || science < 35 || social < 35){
            result = "Fail";
            grade = 'F';
            System.out.println("Sorry You're " + result);
        } else {
            result = "Pass";
            System.out.println("Congrats You're " + result);
        }

        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Tamil: " + tamil);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Science: " + science);
        System.out.println("Social: " + social);
        System.out.println("-------" + "-------");
        System.out.println("Total: " + total);
        System.out.println("-------" + "-------");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("");
        mark.close();
    }
}