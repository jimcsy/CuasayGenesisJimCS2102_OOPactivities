import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int array_size = scan.nextInt();

        int[][] table = new int[array_size][array_size];

        for (int x = 0; x < array_size; x++) {
            for (int j = 0; j < array_size; j++) {
                table[x][j] = (x + 1)*(j + 1);
            }
        }
        System.out.println("Multiplication Table: ");
        for (int x = 0; x < array_size; x++) {
            for (int j = 0; j < array_size; j++) {
                System.out.printf("%4d", table[x][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
