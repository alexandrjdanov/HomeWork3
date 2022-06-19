import java.util.Scanner;

public class Quarter2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double num[] = new double[8];

        System.out.println("Let set initial array.");

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i + 1) + " double: ");
            num[i] = number.nextDouble();
        }

        System.out.println("\nArray reduced by 25%:");
        for (int i = 0; i < num.length; i++) {
            num[i] = (num[i] / 4);
            System.out.print(num[i] + "   ");
        }
    }
}
