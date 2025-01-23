import java.util.Scanner;

public class StringToIntWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = scanner.nextLine(); // Read input as a string

        int num = Integer.parseInt(str); // Convert to integer

        System.out.println("The integer is: " + num);
        scanner.close(); // Close the scanner
    }
}