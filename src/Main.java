import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initilaztions and declarations
        int number;
        double total = 0;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        number = scanner.nextInt();

        //loop that calculates the harmonic number
        for ( double i = 1; i <= number; i++) {
            total += (1 / i);
        }

        //print the result for the user
        System.out.print("The harmonic number of your integer is " + total);
    }
}