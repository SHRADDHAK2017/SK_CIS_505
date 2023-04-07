public class Ball extends Product {
   
   private String color;   //create field color
   
   //No args constructor
   public Ball() {
      color = "";
   }

   ////Accessor and mutator

   public void setColor(String color) {
      this.color = color;
   }
   
   public String getColor() {
      return color;
   }
   
   //Override method
   public String toString() {
      return super.toString() + " \nColor: " + color;
   }
}
