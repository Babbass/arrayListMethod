import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 15 integers
        int[] numbers = new int[15];

        // Prompt the user to enter 15 integers and store them in the array
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = scanner.nextInt();
        }

        // Print the values stored in the array on screen
        System.out.print("Array values: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Ask the user to enter a number and check if it's present in the array
        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Create another array with the same length as the first one
        int[] reversedNumbers = new int[numbers.length];

        // Copy the elements from the existing array to the new array in reverse order
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - i - 1];
        }

        // Print the elements of the new array on the screen
        System.out.print("Reversed array values: ");
        for (int number : reversedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Get the sum and product of all elements of the array
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        // Print the sum and product on their own lines
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}