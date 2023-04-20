package SK_CIS_505.Module6.Composer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.SimpleAttributeSet;

public class TestComposerApp {
 
	static int composerID =0;
    static int option = '\0';
    static Scanner scanner = new Scanner(System.in);
    static Composer composer = new Composer();
    static char answer; //declare character variable
    
    public static void main(String[] args){

        
        int composerID =0;
        int option = '\0';
        Scanner scanner = new Scanner(System.in);
        Composer composer = new Composer();

        
        

        System.out.println(" welcome to the Composer App \n");
        TestComposerApp.displayMenu();

        System.out.println(" End of line... ");
        scanner.close();
    
        

    }
    //public method named displayMenu
        //used do while loop to print and select options
        public static void displayMenu(){

        
    do {
        System.out.println(" Menu Option ");
        System.out.println("1. View Composer ");
        System.out.println("2. Find Composer ");
        System.out.println("3. Add Composer ");
        System.out.println("4. Exit ");
    
        
        
        System.out.println(" Enter an option: ");
        option = scanner.next().charAt(0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");

                    if (option == '1') {
                                        
                                            System.out.println(MemComposerDao.getComposer(composerID) );
                                            
                    }                   
                    else if(option == '2'){
                        System.out.println("\nEnter a composer ID: ");
                    composerID = scanner.nextInt();
                    composer = MemComposerDao.getComposer(composerID);
                    System.out.println("\n");}
                    
                    else if(option == '3'){
                        System.out.print(" Enter an id: ");
                    int id1 = scanner.nextInt();
                    System.out.print("\n Enter a name: ");
                    String name2 = scanner.next();
                    
                    System.out.print("\n Enter a genre ");
                    String genre3 = scanner.next();
                    System.out.println("\n");

                    }
                    
                    else if(option == '4'){
                        System.out.println("Exit");
                        break;

                    }
                  
                    
    } 
   while (answer != '4');

    

    
    

}


    
}
