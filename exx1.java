import java.util.*;

public class exx1 {
   public exx1() {
   }

   public static void main(String[] var0) {
      ArrayList var1 = new ArrayList();
      var1.add("cindrella");
      var1.add("le prince");
      var1.add("math");
      var1.add("ali baba");
      Collections.sort(var1);
      System.out.println("Livres  par ordre CROISSANT :");
      Iterator var2 = var1.iterator();

      String var3;
      while(var2.hasNext()) {
         var3 = (String)var2.next();
         System.out.println(var3);
      }

      var2 = var1.iterator();

      while(var2.hasNext()) {
         var3 = (String)var2.next();
         if (var3.startsWith("a")) {
            var2.remove();
         }
      }

      System.out.println("\nLivres aprés suppression:");
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         String var4 = (String)var5.next();
         System.out.println(var4);
      }

   }
}
