import java.util.Scanner;
 public class PracticeSet06 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        // Area of triangle
         System.out.println("Enter your base in cms :");
         Double base = input.nextDouble();
         System.out.println("Enter your height in cms :");
         Double height = input.nextDouble();
         Double area = 0.5*base*height;
         System.out.println("The area of triangle is" + area + "cms");

     }
}
