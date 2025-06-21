import java.io.*;  
import java.util.*;

class name_pattern  
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  // Scanner object for taking user input
        
        System.out.println("Enter your Name: ");  // Prompting user for input
        String name = sc.nextLine();  // Reading full name from user as a string

        int size = name.length();  // Getting the length of the name for loop control
        
        // Outer loop for number of rows (equal to number of characters)
        for(int i=1;i<=size;i++)
        {
            // Inner loop to print characters from beginning to current row count
            for(int j=0;j<i;j++)
            {
                System.out.print(name.charAt(j)+" ");  // Printing each character followed by space
            }
            System.out.println(" ");  // Moving to next line after each row
        }
    }
}

/*Output: 

Enter your Name: 
bala
b  
b a  
b a l  
b a l a  
*/