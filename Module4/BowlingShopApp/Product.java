import java.util.Scanner;

public class Product {
   private String code;    //Create data field as code
   private String description;   //create data field as description
   private double price;      //create data field as price
   char answer; //declare character variable 
   static char option = '\0';
   Scanner scanner = new Scanner(System.in);
   
   //No args constructor
   public Product() {
      code = "";
      description = "";
      price = 0;
   }
   
   ////Accessor for balance field
   public void setCode(String code) {
      this.code = code;
   }
   
   public String getCode() {
      return code;
   }
   
   public void setDescription(String description) {
      this.description = description;
   }
   
   public String getDescription() {
      return description;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   
   public double getPrice() {
      return price;
   }
   
   //Override method
   public String toString() {
      return " \n\nProduct " + " Code: " + code + " \nDescription: " + description + 
             " \nPrice: " + price;
   }

   

}
