import java.util.Scanner;

class Input {
    public static void main(String[] args){
        String Username;
        Scanner myName = new Scanner(System.in); //This creates a new object called myName
        System.out.println("Enter Username: "); // Prompts the user for a name

        Username = myName.next();
        System.out.println("Hello, " + Username); // Prints a greeting with the user's name
        myName.close();  
    }
    
}


