package practice;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int num1;
        System.out.println("This is a pattern program.");
        Scanner pattern = new Scanner(System.in);
        System.out.println("Choose a Special Character please");
        char ch = pattern.next().charAt(0);
        System.out.println("Please enter the number of rows you would like to use");
        num1 = pattern.nextInt();
    
        for(int i = 0; i < num1; i++) {
            System.out.println("\n");
            for(int j = 0; j <= i ; j++) {
                System.out.print("\t"+ch);
            }
        }
        pattern.close();
    }
  
}

