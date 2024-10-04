import java.util.Scanner;

public class GetArrayMean {

    public static float getArrayMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (float) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int array_size = scan.nextInt();

        int[] numbers = new int[array_size];

        for (int x = 0; x < array_size; x++) {
            System.out.print("Enter number: ");
            numbers[x] = scan.nextInt();
        }

        float mean = getArrayMean(numbers);
        System.out.printf("Mean of the array: %.2f", mean);

        scan.close();
    }
}
