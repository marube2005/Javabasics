package practice;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        int[] array = new int[5];
        int i,sum = 0;
        float average ;
        try (Scanner deals = new Scanner(System.in)) {
            for( i = 0; i < array.length; ++i){
               System.out.println("Enter an integer please.");
               array[i] = deals.nextInt();
               sum += array[i];
            }
            average = sum / array.length;
            System.out.println("The integers you entered are: \n");
            for(i = 0; i < array.length; ++i){
                System.out.println(array[i]); //
            }   
            System.out.println("You sum is\t"+sum+"\t and your average is \t"+average);    
            deals.close();
        }
    }
}
