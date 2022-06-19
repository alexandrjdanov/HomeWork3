public class Quarter {
    public static void main(String[] args) {
        double num[] = {2, 50, -74, 33, -968, 32, 19, 12};
        System.out.println("Initial array:");
        for (int i = 0; i < 8; i++) {
            System.out.print(num[i] + "   ");
        }

        System.out.println("\n\nArray reduced by 25%:");
        for (int i = 0; i < num.length; i++) {
            num[i] = (num[i] / 4);
            System.out.print(num[i] + "   ");
        }
    }
}
