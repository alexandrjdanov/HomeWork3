import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int x = in.nextInt();
        int num[] = new int[x];

        System.out.println("Let set initial array.");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i + 1) + " integer: ");
            num[i] = in.nextInt();
        }

        System.out.println("\nArray in reversed direction: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + "   ");
        }
    }
}
