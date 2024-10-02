package practice;
import java.util.*;
public class Interest3 {
    public static void main(String[] args){
        double principal;
        double rate = 0.07;
        int time,i ;
        double interest;

    System.out.println("This is a program to compute yearly interest");
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the principal amount");
    principal = scanner.nextDouble();
    System.out.println("Please enter the time period in years");
    time = scanner.nextInt();

    if(time < 5){
        System.out.println("Time period should be greater than or equal to 5 years \n");
        System.out.println("We will only compute your first year interest \n");
        interest = principal * rate ;
        System.out.println("Your first year interest should be"+interest);
    }

    else if( time <= 0){
         System.out.println("Time period should be above zero please. Enter a valid time period");
    }

    else{
        for(i = 1; i <= time; i++){
        
        interest = principal * rate ;
        principal += interest;
        System.out.println("Year " +i+ "  interest should be " +interest + " and principle is: "+principal);
        }
    }
    scanner.close();
    }
}
