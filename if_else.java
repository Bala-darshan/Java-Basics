import java.io.*;
import java.util.Scanner;

public class if_else
{
 public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);  // Scanner class for input
        System.out.print("Enter your age: ");  // Prompt user to enter age
        int age = sc.nextInt();  // Read the input

        // Check eligibility
        if (age >= 18 && age <= 100) 
        {
            System.out.println("You are eligible to get the license.");  // Eligible
        }
        else
        {
            System.out.println("You are not eligible to get the license.");  // Not eligible
        }
        sc.close();  // Close the scanner
    }
}
