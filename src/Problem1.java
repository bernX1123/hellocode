import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome, " + name + "!");

        System.out.print("Enter an integer: ");
        int int1 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter an second integer: ");
        int int2 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter an third integer: ");
        int int3 = scan.nextInt();
        scan.nextLine();

        double solution = (int1*int2*int3)/3.0;
        System.out.println("The average of " + int1 + ", " + int2 + ", and " + int3 + " is " + solution);
        scan.close();  // "close" scanner at the end

    }
}
