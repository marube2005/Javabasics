package practice;
import java.util.Scanner;
public class Details {
    public static void main(String[] args){
        String firstName,secondName,thirdName,course;
        int age,year_of_study,year_next;
        float height;

        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter the first name");
        firstName = enter.next();
        System.out.println("Please enter the second name");
        secondName = enter.next();
        System.out.println("Please enter the third name");
        thirdName = enter.next();
        System.out.println("Please enter your age");
        age = enter.nextInt();
        System.out.println("Please enter your height");
        height = enter.nextFloat();
        System.out.println("Please enter your Course");
        course = enter.next();
        System.out.println("Please enter your year of study");
        year_of_study = enter.nextInt();
        year_next = ++(year_of_study);

        System.out.println("FirstName: "+firstName+"\n"+"SecondName: "+secondName+"\n"+"ThirdName:"+thirdName+"\n"+"Age:"+age+"\n"+"height"+height+"\n"+"Course"+course+"\n"+"Year_next"+year_next+"\n");
        enter.close();

    }
}
