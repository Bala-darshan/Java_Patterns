import java.util.*;

public class RightHalfPyramidPattern {
    public static void main(String[] args) {
        // Right half pyramid star pattern

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int num = sc.nextInt(); // Get the number of rows from the user

        for (int i = 0; i < num; i++) { // Loop for each row
            for (int j = 0; j <= i; j++) { // Loop for each column in a row
                System.out.print("*"); // Print star (or any symbol)
            }
            System.out.println(); // Move to the next line
        }

        sc.close(); // Close the Scanner
    }
}
/* Output : 
Enter the size: 
5
*
**
***
****
*****
*/
