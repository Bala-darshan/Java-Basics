import java.io.*;
import java.util.*;
class basic_scanner
{
    public static void main(String[] args) 
    {
        //for getting a input from the user we use the scanner class.

        //for creating the scanner class we use the scanner keyword.

        //here we created the scanner class with the variable name called sc.

        // we can use any of the keyword for the scanner class.

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ?"); // printing the statement
        String name = sc.nextLine(); 

        // here we used the non-primitive datatype called the string for getting the input from user.

        // the variable "name" stores the user's input.

        System.out.println(name); // here we prints the user's input as the output.

        //output ex: what is your name ?
        // AAA
        // AAA (the console prints like this).
        
    }
}