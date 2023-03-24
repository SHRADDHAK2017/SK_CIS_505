/*Dtae: 03/24/2023
 * Created a program to enter team name and player names
 * to get Team Summary as out put
 */
import java.util.Scanner;			

public class TestSportsTeamApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean stop = false;		//boolean value for stop 
		while(!stop) {				//initiating while loop

		System.out.print("\nEnter a team name: ");   //Asks user input for team name
		String teamName = scan.nextLine();
		
		System.out.print("\nEnter the player names: " + 
		"\n hint: use commas for multiple players; no spaces>: "); //User input for player names
		String players = scan.nextLine();
		
		Team team = new Team (teamName);
		
		 String[] playerArray = players.split(",");  //Use of Array.split(“,”) method to convert user input to array
	
		for (String player : playerArray) {			//for loop to add players
			team.addPlayer(player);
		}
		
		//Out put for team summary
		System.out.println("\n -- Team Summary-- ");
		System.out.println("\nNumber of players in team: " + team.getPlayerCount());
		System.out.println("\nPlayers on team: "  );
		
		for (String player : team.getPlayers()) {
			System.out.print(player + ", ");
		}
		
		System.out.println();
		
		/*Asking user if he wishes to continue and 
		end program if entered 'n' or continue to put information
		if entered 'y'*/
    	
    	System.out.println("\n Continue? (y/n): ");
    	String s = scan.nextLine();
   		 if(s.equals("n")) {
      	  stop = true;
		  System.out.println(" \nEnd of line.... ");

		
    }
}
		
	}

}
