import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TotalNgaNumber = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int NumberNgaIscan = scanner.nextInt();
            TotalNgaNumber += NumberNgaIscan;
        }

        System.out.println("\nTotal Number: " + TotalNgaNumber);

        scanner.close();
    }
}
