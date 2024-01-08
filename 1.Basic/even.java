import java.util.*;

public class even {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
