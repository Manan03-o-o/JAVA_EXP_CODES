import java.util.Scanner;

public class PracticeSet02 {
    public static void main(String[] args) {
        //Swapping of two numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A :");
        int a = input.nextInt();
        System.out.println("Enter value of B :");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping done");
        System.out.println("Value of A is:" +a);
        System.out.println("Value of B is:" +b);

        
    }

}
