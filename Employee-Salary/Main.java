import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Example Salary Slip");
        System.out.println("");
        Scanner value = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = value.nextLine();
        System.out.println("Enter Your Id");
        String id = value.nextLine();
        System.out.println("Enter Your Salary");
        double salary = value.nextInt();
        System.out.println("Enter Your Allowance");
        double allowance = value.nextInt();
        System.out.println("Enter Your Deduction");
        double deduction = value.nextInt();

        double totalsalary = salary + allowance + deduction;

        System.out.println("Example Salary Slip");
        System.out.println("");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("");
        System.out.println("Basic Salary: " + salary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Deduction: " + deduction);
        System.out.println("---------------------");
        System.out.println("Net Salary: " + totalsalary);

        value.close();
    }
}