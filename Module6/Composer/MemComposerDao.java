package SK_CIS_505.Module6.Composer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface MemComposerDao {

    public static Composer getComposer(int composerID){

        List <Composer> listOfComposers = new ArrayList<>();

    Composer idComposer = new Composer(1007, "Shraddha", "Classical");
    Composer idComposer2 = new Composer(1008, "Arjun", "Western");
    Composer idComposer3 = new Composer(1009, "Gauri", "Indian");

    listOfComposers.add(idComposer);
    listOfComposers.add(idComposer2);
    listOfComposers.add(idComposer3);
    System.out.println(" Diplaying list of composer ");

     System.out.println(listOfComposers);

        Composer composer = new Composer();
        
        if(composerID == 1007){
        
       System.out.println("\n" + " Id: 1007 " + "\n" + " Name: Shraddha "+  "\n" + " Genre: Classical ");
        }

        else if(composerID == 1008){

            System.out.println("\n"+ " Id: 1008 " + "\n" + " Name: Arjun " + "\n" + " Genre: Western ");
        }
        
        else if(composerID == 1009){

            System.out.println("\n" + " Id: 1009 " + "\n" + " Name: Gauri " + "\n" + " Genre: Indian");
        }
        return composer;

        }

	
}

    

    
    

