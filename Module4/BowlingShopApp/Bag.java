public class Bag extends Product {
   private String type;    //create data field named Bag
    
   //No args constructor
   public Bag() {
      type = "";
   }
   
   
   public void setType(String type) {
      this.type = type;
   }
   
   public String getType() {
      return type;
   }
   
//Override method
   public String toString() {
      return super.toString() + " \nType: " + type;
   }
}
