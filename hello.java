import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Find the biggest number
        int biggest = num1;

        if (num2 > biggest) {
            biggest = num2;
        }

        if (num3 > biggest) {
            biggest = num3;
        }

        // Print the biggest number
        System.out.println("The biggest number is: " + biggest);
        
        scanner.close();
    }
}
