import java.util.Scanner;

public class UnitsConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number in inches: ");
        int num1 = in.nextInt();
        double result = (num1 * 0.0254);

        System.out.println(num1 + ".0 inch is " + result + " meters.");
    }
}
