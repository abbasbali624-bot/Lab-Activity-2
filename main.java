public class main {
   public static void main(String[] args) {
      
      Vehicle vehicle1 = new Vehicle();
      vehicle1.brand = "Toyota";
      vehicle1.model = "Camry";
      vehicle1.year = 2024;
      
      Vehicle vehicle2 = new Vehicle();
      vehicle2.brand = "Honda";
      vehicle2.model = "Civic";
      vehicle2.year = 2011;
      
      Vehicle vehicle3 = new Vehicle();
      vehicle3.brand = "BMW";
      vehicle3.model = "M3";
      vehicle3.year = 2024;
      
      System.out.println("Vehicle 1: ");
      vehicle1.displayInfo();
      System.out.println("Age: " + vehicle1.calculateAge());
      System.out.println("Vintage: " + vehicle1.isVintage());
      
      System.out.println();
      
      System.out.println("Vehicle: 2");
      vehicle2.displayInfo();
      System.out.println("Age: " + vehicle2.calculateAge());
      System.out.println("Vintage: " + vehicle2.isVintage());
      
      System.out.println();
      
      System.out.println("Vehicle: 3");
      vehicle3.displayInfo();
      System.out.println("Age: " + vehicle3.calculateAge());
      System.out.println("Vintage: " + vehicle3.isVintage());
      
      }
 }

      
      


      
      