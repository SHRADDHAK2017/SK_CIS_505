import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseTracker {
    

    public static void main(String[] args) throws IOException{

        
        char option = '\0';
        char answer;
        String input;

        Scanner scanner = new Scanner(System.in);

        TransactionIO.findAll();
        
        
        do{

            System.out.println(" welcome to Expense tracker ");
            System.out.println("\nMENU OPTIONS: ");

            System.out.println(" View Transactions ");
            System.out.println(" Add Transactions ");
            System.out.println(" View Expenses ");
            
            
            System.out.println(" \n\n Please choose option ");
           
            
            option = scanner.next().charAt(0);
            
            

         if(option == '1'){

                //System.out.print(" MONTHLY EXPENSE " + expenses.txt);
            
           

            
         }

         else if(option == '2'){

            String c = "y";
            ArrayList<Transaction>transactions = new ArrayList<>();

            while(c.equalsIgnoreCase("y")){
                String description  = ValidatorIO.getString(scanner, " \n Enter the description ");
                double amount = ValidatorIO.getDouble(scanner, "\n Enter the amount ");

                Transaction transaction = new Transaction( null, description, amount);
                transactions.add(transaction);
                
                c = ValidatorIO.getString(scanner, "\n Add another transaction(y/n): ");
               

                
            }
            try{
                TransactionIO.bulkInsert(transactions);
            }
            catch(IOException e){
                System.out.println("\n Exception: " + e.getMessage());
            }
            
         }

         else if(option == '3'){

           
            
            System.out.println(" Your total monthly expense is:  " + "$"  );           
            
         }


            

            

        

            System.out.println("Do you want to continue? Y|N");
            answer = scanner.next().charAt(0);

        }
        while (answer == 'Y');




        System.out.println(" End of line... ");
        scanner.close();

    }

    
}
