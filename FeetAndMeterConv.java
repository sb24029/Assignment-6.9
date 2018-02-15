import java.util.Scanner;
public class FeetAndMeterConv{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("This program converts between feet and meters");
      System.out.printf("%5s%12s%6s%12s%12s\n","Feet","Meters","|","Meters","Feet");
      System.out.println("                                                    ");
   
      for(double f = 1.0, m = 20; f <= 10.0; f++, m += 5.0){
         System.out.printf("%5.1f%12.3f%6s%12.1f%12.3f\n", f, footToMeter(f), "|", m, meterToFoot(m));
      }
   
   }
   public static double footToMeter(double foot){
      return foot * 0.3048;
   }
   public static double meterToFoot(double meter){
      return meter / 0.3048;
   }

}



