import java.util.Queue;
import java.util.Scanner;

public class TestBowlingShopApp {
    static char answer; //declare character variable
    static char option = '\0';
    static Scanner scanner = new Scanner(System.in);
    private static Queue<Product> products; 

    //A public static method named displayMenu that displays the menu
    public static void displayMenu(){

        //do while loop to print out option reiterate the loop
        do {
            System.out.println(" Menu Options ");
	        System.out.println(" Enter <b> Bowling balls ");
            System.out.println(" Enter <a> Bowling bags ");
            System.out.println(" Enter <s> Bowling shoes ");
            System.out.println(" Enter <x> To exit ");
	    

            
            System.out.println(" Enter an option>: ");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            System.out.println(" --Product Listing-- ");

          //if.else-if statements to display information for selected option  
            if(option == 'b'){
            
            products = ProductDB.getProducts("b");
            System.out.println(" Products (b):\n" + products);
            }
            
            
            else if(option == 's'){
            products = ProductDB.getProducts("s");
            System.out.println(" Products (s):\n" + products);
            }
            
            else if (option == 'a'){
            products = ProductDB.getProducts("a");
            System.out.println("Products (a):\n" + products);
            }

            else if(option =='x'){
            products = ProductDB.getProducts("x");
                    System.out.println("Exit");
                    break;
            }
                
            
            

            
        } 
        while (answer == 'x');
                

                
            

    } 

}
        

        

    
        


