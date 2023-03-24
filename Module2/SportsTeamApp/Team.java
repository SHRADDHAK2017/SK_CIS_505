public class Team{

private String teamName;	//name of the team
private String[] players = new String[20];		//An array to store players
private int playerCount; 

public Team(String teamName){   //add teamname

this.teamName = teamName;
}

public void addPlayer(String player){

players[playerCount] = player;      //add student to array
playerCount++;

}

public String[] getPlayers(){       //return players
return players;

}

public int getPlayerCount(){

return playerCount;                 //return number of players

}

public String teamName(){

return teamName;                    //return name of the team
}

}