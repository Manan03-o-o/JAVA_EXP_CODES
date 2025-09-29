import java.util.Scanner;
public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter all 4 side in cms: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double perimeter = a+b+c+d;
        System.out.println("Perimeter of your rectangle is :" + perimeter);

    }
}
