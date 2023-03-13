package College;

import java.util.Scanner;
 
// Class
public class Library {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating object of Scanner class
        // to take input from user
        Scanner input = new Scanner(System.in);
 
        // Displaying menu
        System.out.println(
            "********************Welcome to the Alterra Library!********************");
        System.out.println(
            "**********************************************************************");
 
        // Creating object of book class
        books ob = new books();
 
        int choice;
        int searchChoice;
 
        // Creating menu
        // using do-while loop
        do {
 
            ob.dispMenu();
            choice = input.nextInt();
 
            // Switch case
            switch (choice) {
 
                // Case
            case 1:
                book b = new book();
                ob.addBook(b);
                break;
 
                // Case
            case 2:
                ob.upgradeBookQty();
                break;
 
            // Case
            case 3:
 
                System.out.println(
                    " 1.Search by ID");
                System.out.println(
                    " 2.Search by Book's Author Name.");
                searchChoice = input.nextInt();
 
                // Nested switch
                switch (searchChoice) {
 
                    // Case
                case 1:
                    ob.searchBySno();
                    break;
 
                    // Case
                case 2:
                    ob.searchByAuthorName();
                }
                break;
 
                // Default case that will execute for sure
                // if above cases does not match
            default:
 
                // Print statement
                System.out.println("ENTER BETWEEN 0 TO 3.");
            }
 
        }
 
        // Checking condition at last where we are
        // checking case entered value is not zero
        while (choice != 0);
    }
}
