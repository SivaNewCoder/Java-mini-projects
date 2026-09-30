import java.util.Scanner;

class Main {
    public static void main(String[] args){
        System.out.println("** Age Calculation **");

        int days;
        int months;
        int years;
        
        Scanner birthday = new Scanner(System.in);
        
        System.out.println("Enter the Birth Day:");
        int bday = birthday.nextInt();

        System.out.println("Enter the Birth Month:");
        int bmonth = birthday.nextInt();

        System.out.println("Enter the Birth Year:");
        int byear = birthday.nextInt();

        System.out.println("Enter the Current Day:");
        int cday = birthday.nextInt();

        System.out.println("Enter the Current Month:");
        int cmonth = birthday.nextInt();

        System.out.println("Enter the Current Year:");
        int cyear = birthday.nextInt();

        System.out.println("Your Birth Day:" + bday + "/" + bmonth + "/" + byear);
        System.out.println("Current Day:" + cday + "/" + cmonth + "/" + cyear);

        days = cday - bday;
        months = cmonth - bmonth;
        years = cyear - byear;

    if (days<0) {

        int previousMonth;
        int previousMonthDays;
        int previousMonthYear;

        if(cmonth == 1){
            previousMonth = 12;
            previousMonthYear = cyear - 1;
        }else{
            previousMonth = cmonth - 1;
            previousMonthYear = cyear;
        }

        switch(previousMonth) {
            case 1: 
                previousMonthDays = 31;
                break;
            case 2 :
               if (previousMonthYear % 400 == 0 ||
                    (previousMonthYear % 4 == 0 && previousMonthYear % 100 != 0)) {
                    previousMonthDays = 29;
                } else {
                    previousMonthDays = 28;
                }
                break;
            case 3 :
                previousMonthDays = 31;
                break;
            case 4 :
                previousMonthDays = 30;
                break;
            case 5 :
                previousMonthDays = 31;
                break;
            case 6 :
                previousMonthDays = 30;
                break;
            case 7 :
                previousMonthDays = 31;
                break;
            case 8 :
                previousMonthDays = 31;
                break;
            case 9 :
                previousMonthDays = 30;
                break;
            case 10 :
                previousMonthDays = 31;
                break;
            case 11 :
                previousMonthDays = 30;
                break;
            case 12 :
                previousMonthDays = 31;
                break;
            default :
                previousMonthDays = 0;
            }
                days = previousMonthDays + days;
                months = months - 1; 
    }
    
        if(months < 0){
        months = months + 12;
        years = years - 1; 
        }

        System.out.println("Your Current Age: " + years + " Years " + months + " Months " + days + " Days");
        birthday.close();

    }
}