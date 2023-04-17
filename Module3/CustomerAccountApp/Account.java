import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account{

private double balance;     //create data field named balance
private static double defaultBalance = 200; //default balance is set to 200
char answer; //declare character variable
char option = '\0';
Scanner scanner = new Scanner(System.in);

//Accessor for balance field
public Account(){

balance  = defaultBalance;
}

public void setBalance(double balance){

this.balance = balance;

}

public double getBalance(){

return balance;
}

//Public method to create deposit
public void deposit (double amt){

balance += amt;
}

//Public method to withdraw
public void withdraw(double amt){

if(balance >= amt){

balance -= amt;
}

else{

	System.out.println(" Insufficient funds ");

	}
}

//public method named displayMenu
//used do while loop to print and select options for transactions
public void displayMenu(){

        
        do {
            System.out.println(" Account Menu ");
	        System.out.println(" Enter <D/d> for deposit ");
            System.out.println(" Enter <W/w> for withdraw ");
            System.out.println(" Enter <B/b> for balance ");
	    
            
            
            System.out.println(" Enter an option>: ");
            option = scanner.next().charAt(0);
            System.out.println("\n");

switch (option) {
                case 'B': case 'b':
                    System.out.println("Account balance = " + getBalance());
                    System.out.println("\n");
                    break;

                case 'D': case 'd':
                    System.out.println("Enter an amount to deposit: ");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'W':case 'w':
                    
                    System.out.print("Enter an amount to withdraw: ");
                    double amount2 = scanner.nextDouble();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;


                default:
                    System.out.println("Error: Invalid Option!!!");
                    break; 
            }

            System.out.println("Do you want to continue? Y|N");
            answer = scanner.next().charAt(0);

        } 
        while (answer == 'Y' | answer =='y');

}

// public method named getTransactionDate
public String getTransactionDate(){

Date date = new Date();
SimpleDateFormat sdf = 	new SimpleDateFormat("mm-dd-yyyy");
return sdf.format(date);
}

}