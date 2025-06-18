import java.io.*;
import java.util.*;

// This program collects and displays personal details entered by the user
class personal_details
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        System.out.print("Enter your Name: ");
        String name = sc.nextLine(); // Read full name (including spaces)

        System.out.print("Enter your Age: ");
        int age = sc.nextInt(); // Read age as integer

        System.out.print("Enter your Phone Number: ");
        long ph_no = sc.nextLong(); // Read phone number as long

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your Address: ");
        String addr = sc.nextLine(); // Read full address

        // Displaying the collected details
        System.out.println();
        System.out.println("Your Details !!! ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone_number: "+ph_no);
        System.out.println("Address: "+addr);
    }
}
