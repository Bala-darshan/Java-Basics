import java.util.*;
public class swapping
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("give A: ");
        int a = sc.nextInt(); // Read the value of variable 'a' from user input
        System.out.println("give B: ");
        int b = sc.nextInt(); // Read the value of variable 'b' from user input

        System.out.println("Before swapping: a = " + a + ", b = " + b); // Display values before swapping

        a = a + b; // Step 1: Add both values and store the result in 'a'
        b = a - b; // Step 2: Subtract new 'a' by 'b' to get original 'a', assign it to 'b'
        a = a - b; // Step 3: Subtract new 'a' by new 'b' to get original 'b', assign it to 'a'
        
        System.out.println("After swapping: a = " + a + ", b = " + b); // Display values after swapping
    }
}
/*
output: 
give A: 
5
give B: 
10
Before swapping: a = 5, b = 10
After swapping: a = 10, b = 5

*/