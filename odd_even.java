import java.io.*; 
import java.util.*; 

class odd_even 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        System.out.println("Enter the number: "); // Prompting user to enter a number
        int num = sc.nextInt(); // Reading the number from user input

        // Checking if the number is divisible by 4
        if(num % 2==0)
        {
            System.out.println("It is an even number"); // If divisible by 4, consider it as even
        }
        else
        {
            System.out.println("It is an odd number"); // Otherwise, consider it as odd
        }
    }
}
/*output_1:

Enter the number: 
8
It is an even number

output_2:

Enter the number: 
7
It is an odd number

 */