import java.util.Scanner;

public class ValidatorIO {

    public static int getInt(Scanner sc,String prompt){
        int input = 0;
        boolean isValid = false;

        while(!isValid){

            System.out.print(prompt);

            if(sc.hasNextInt()){

                input = sc.nextInt();
                isValid = true;
            }
            else{

                System.out.println("\n Error! Invalid integer value. ");
            }
            sc.nextLine();
        }
        return input;
    }
        
    public static Double getDouble(Scanner sc, String prompt){

        Double input = 0.0;
        boolean isValid = false;

        while(!isValid){

            System.out.print(prompt);

            if(sc.hasNextDouble()){

                input = sc.nextDouble();
                isValid = true;
            }
            else{

                System.out.println("\n Error! Invalid integer value. ");
            }
            sc.nextLine();
        }
        return input;

    }

    public static String getString(Scanner sc, String prompt){
        String input = "";
        boolean isValid = false;

        while(!isValid){

            System.out.print(prompt);

            if(sc.hasNext()){

                input = sc.next();
                isValid = true;
            }
            else{

                System.out.println(" \n Error! Invalid integer value. ");
            }
            sc.nextLine();
        }
        return input;


    }
    
}
