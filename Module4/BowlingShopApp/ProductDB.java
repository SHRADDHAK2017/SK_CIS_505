import java.util.LinkedList;
import java.util.Queue;

public class ProductDB {
   public static Queue<Product> getProducts(String code) {
      Queue<Product> products = new LinkedList<>();
      
      if (code.equals("b")) {
         for (int i = 1; i < 5; i++) {
            Ball b = new Ball();
            b.setCode("B" + i);
            b.setDescription("Ball " + i);
            b.setPrice(i * 10);
            b.setColor("Red");
            products.add(b);
            
         }
      }
      else if (code.equals("s")) {
         for (int i = 1; i < 5; i++) {
            Shoe s = new Shoe();
            s.setCode("S" + i);
            s.setDescription("Shoe " + i);
            s.setPrice(i * 15);
            s.setSize(i + 7);
            products.add(s);
         }
      }
      else if (code.equals("a")) {
         for (int i = 1; i < 3; i++) {
            Bag a = new Bag();
            a.setCode("A" + i);
            a.setDescription("Bag " + i);
            a.setPrice(i * 20);
            a.setType("Roller");
            products.add(a);
         }
      }
      else {
         products = new LinkedList<>();
      }
      
      return products;
   }
}
