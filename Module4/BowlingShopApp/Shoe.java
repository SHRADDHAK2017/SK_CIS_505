public class Shoe extends Product {
   private double size;    //create data field size

   //No args constructor
   public Shoe() {
      size = 0;
   }
 
   public void setSize(double size) {
      this.size = size;
   }
   //Accessor and mutator
   public double getSize() {
      return size;
   }
   
//Override method
   public String toString() {
      return super.toString() + " \nSize: " + size;
   }
}