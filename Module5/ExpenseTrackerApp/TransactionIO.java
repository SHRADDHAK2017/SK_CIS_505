import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransactionIO {
   
    
    private static final PrintWriter output = null;
    private static final Object[] Transaction = null;
      private static List <Transaction> transaction = new ArrayList<Transaction>();
    private static String FILE_NAME = "expenses.txt";

    static File f = new File(FILE_NAME);

    public static void bulkInsert(List <Transaction> tran)throws IOException{
        PrintWriter output = null;

        if(f.exists())
        {
        
        output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        
        }
        else{

            output = new PrintWriter(FILE_NAME);
        }

        output.close();

        

        
    }


    public static void findAll()throws IOException{

        ArrayList<Transaction> transactions = new ArrayList<>();
        Scanner io = new Scanner(f);
        while(io.hasNext()){

            String online = io.next();
            for(Transaction transaction: transactions){

                output.print(transaction.getDate()+ "");
                output.print(transaction.getDescription() + "");
                output.println(transaction.getAmount()+ "");
            }

          

        }
        
    
        
        
        
        
    }


    


    
}
