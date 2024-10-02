package practice;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
      int sequence,first = 0, second = 1,next;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the  number of terms you wish to be in the fibonacci sequence");
      sequence = s.nextInt();
      System.out.println("Your fibonacci sequence is: \n"+ first+"\n "+ second);
      for (int i = 0; i < sequence; i++) {
       next = first + second;
       first = second;
       second = next;
       System.out.println(""+next);
    }
   s.close();
  }
}
