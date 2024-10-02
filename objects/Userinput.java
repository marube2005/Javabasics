package objects;
import java.util.Scanner;
public class Userinput{
    public static void main(String[] args) {
        String name;
        int age;
        int year;
        String course;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.next();
        System.out.println("enter your age:");
        age=scanner.nextInt();
        System.out.println("enter year of study:");
        year=scanner.nextInt();
        System.out.println("name of your course:");
        course=scanner.next();
        System.out.println("my name is " + name + "  and age is " + age+" and year is" +"course is" +course+ ".I do   ");


        scanner.close();

    }
}