import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        //simple code for leap year calculation
        
        try (Scanner sc = new Scanner(System.in)) {
    //this was done by vs code
            System.out.println("Enter a year , I will tell if that is a leap year or not");
            int year=sc.nextInt();

    //A year is a leap year is it is {divisble by 400} or {divisble by 4 but not by 100}

            if (((year%4 == 0) && (year % 100 !=0)) || (year % 400 ==0)){
                System.out.println(year+" is a leap year");
            }
            else System.out.println(year+ " is not leap year");
        }
        System.out.println(" Thanks ");
    }
    
}
