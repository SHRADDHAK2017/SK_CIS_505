/*Date: 0.-30-2023
 * Assignment 3.1 OO methods
 * Created java classes forCustomer, CustomerDB,Account and TestCustomerAccountApp
 * This program is written to conduct atm transactions for already created CustomerDB
 */
import java.util.Scanner;

public class TestCustomerAccountApp{

public static void main(String[] args) {
        int customerID = 0;
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        Account account = new Account();
        System.out.println(" welcome to the Composer App ");
        System.out.println("\nEnter a customer ID: ");
        customerID = scanner.nextInt();
        customer = CustomerDB.getCustomer(customerID);
        System.out.println("\n");
        account.displayMenu();
        System.out.println("\n---Customer Details--- " + customer.toString());
        System.out.println("\n Balance as of " + account.getTransactionDate() + " is $" + account.getBalance());
        System.out.println("\n");
        
        System.out.println(" End of line... ");
        scanner.close();
    
    }





}