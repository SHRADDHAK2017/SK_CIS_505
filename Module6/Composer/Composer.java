package SK_CIS_505.Module6.Composer;

public class Composer {
    

    private int id;          //A private integer data field named id
    private String name;    //A private string data field named name
    private String genre;   //A private string data field named genre

    //A no-argument constructor that creates a default composer.

        public Composer(){

            id = 0;
            name = "";
            genre = "";

        }

    //An argument constructor that creates a composer

        public Composer(int id, String name, String genre){

            this.id = id;
            this.name = name;
            this.genre = genre;

        }


    //Accessor methods

        public void setId(int id){

            this.id = id;
        }

        public int getId(){

            return id;
        }

        public void setName(String name){

            this.name =name;
        }

        public String getName(){

            return name;
        }

        public void setGenre(String genre){

            this.genre = genre;
        }

        public String getGenre(){

            return genre;
        }

        //Override method to get a string description for a Composer

        public String toString(){

            return "\n" + "Id: " +getId() +"\n" + " Name: "+getName() + "\n" + " Genre: " +getGenre() +"\n";
            }



}
