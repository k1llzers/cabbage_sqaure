import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();

        int length = 2 * n + 1;
        int width = length;

        int number = 9;
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                int num = number - Math.max(Math.abs(row - n), Math.abs(col - n));
                System.out.print(num);
            }
            System.out.println();
        }
    }
}