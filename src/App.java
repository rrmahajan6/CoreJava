public class App {
   int a = 10;
   static int b = 20;

   public static void main(String[] args) {
      System.out.println("Hello, World!");
      System.out.println(Color.Rahul);
      System.out.println(Color.Mahajan);
      System.out.println(Color.Sapna);
   }
   public enum Color {
      Rahul, Mahajan, Sapna, Pawar
   }
   public enum Color2 {
      Rahul, 
      Mahajan, 
      Sapna, 
      Pawar
   }
}