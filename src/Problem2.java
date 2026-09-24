import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Player 1's name?: ");
        String name1 = scan.nextLine();
        System.out.println("Enter your number: ");
        Double number1 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Player 2's name?: ");
        String name2 = scan.nextLine();
        System.out.println("Enter your number: ");
        Double number2 = scan.nextDouble();
        scan.nextLine();

        if (number1>number2){
            System.out.println(name1 + "'s number is bigger!");
        } else if (number2>number1) {
            System.out.println(name2 + "'s number is bigger!");
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
