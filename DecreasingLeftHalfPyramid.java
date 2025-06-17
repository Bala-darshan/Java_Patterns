import java.io.*;
import java.util.*;

class DecreasingLeftHalfPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: "); // Prompt the user for size
        int size = sc.nextInt(); // Read the size from user input

        for (int i = size; i >= 1; i--)  // Loop for rows 
        {
            for (int j = 1; j <= i; j++)  // Loop for columns
            {
                System.out.print("*"); // You can replace '*' with any symbol
            }
            System.out.println(); // Move to the next line
        }
    }
}
