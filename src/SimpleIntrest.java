import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of principle amount Rs");
        int principle = input.nextInt();
        System.out.println("Enter the value of rate of intrest :");
        float rate = input.nextFloat();
        System.out.println("For how many years you are borrowing the money ");
        float years = input.nextFloat();
        float intrest = (principle*rate*years)/100;
        System.out.println("Your Simple Intrest is Rs:" + intrest);
    }
}
