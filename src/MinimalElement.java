import java.util.Random;
import java.util.Scanner;

public class MinimalElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int x = in.nextInt();
        int num[] = new int[x];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            System.out.print(num[i] + "   ");
        }

        int min;
        min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) min = num[i];
        }
        System.out.println("\n\nMinimal array integer is: " + min);
    }
}

