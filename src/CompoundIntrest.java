import java.util.Scanner;
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of principle amount Rs");
        int principle = input.nextInt();
        System.out.println("Enter the value of rate of intrest :");
        float rate = input.nextFloat();
        System.out.println("For how many years you are borrowing the money ");
        float years = input.nextFloat();
        double compInt = principle*Math.pow((1+ rate /100),years);
        System.out.println("Your Compound Intrest is Rs:" + compInt);
    }
}
