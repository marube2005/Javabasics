package practice;
import java.util.*;
public class Interest {
    public static void main(String[] args) {
        double principal;
        double rate = 0.05;
        int time ;
        double interest;
    System.out.println("Interest Calculator");
    System.out.println("This is a program to calculate interest rates after a period of time");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the principal");
    principal = scanner.nextDouble();
    System.out.println("Please enter the time period in years");
    time = scanner.nextInt();
    interest = principal * rate * time ;
    principal += interest;
    System.out.println("The interest after " + time + " years is: " + interest+"and your money is: " + principal);
    scanner.close();

    }
}
