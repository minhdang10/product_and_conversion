import java.util.Scanner;


public class MultiplyOutputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = in.nextInt();

        System.out.println("Enter the second number");
        int num2 = in.nextInt();

        System.out.println("The product is " + (num1 * num2));
    }
}
