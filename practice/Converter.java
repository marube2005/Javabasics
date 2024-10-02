package practice;
import java.util.Scanner;
public class Converter {
    public static void main(String[] args){
        System.out.println("Program to convert Fahrenheit to degrees Celsius");
        float fahrenheit, celcius;          //declaring fahrenheit and celcius
        Scanner temp = new Scanner(System.in);      //creating a scanner object.

        System.out.println("Enter Temperature in Fahrenheit: " );    //Prompting for fahrenheit from the user
        fahrenheit = temp.nextFloat();          // Reading in the fahrenheit from the user.
        celcius = (fahrenheit - 32) * 5/9;        // conversion from fahrenheit to celcius

        System.out.println("Your Temperature in Fahrenheit was "+fahrenheit+" and in degrees it is "+celcius); 

        temp.close();
    }
}
