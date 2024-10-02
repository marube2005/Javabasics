import java.sql.*;
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        // Replace with your database credentials
        String url = "mysql://localhost:3306/elvo.db";
        String username = "emarube89@gmail.com";
        String password = "153932022";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        // Establish a connection to the database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a prepared statement to insert data
            String query = "INSERT INTO your_table (name, email, age) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, age);

            // Execute the prepared statement
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Error inserting data.");
            }

            // Close the connection and prepared statement
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}