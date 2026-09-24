import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a 3 digit Integer: ");
        int integer = scan.nextInt();

        int reverse1 = integer/100;
        int reverse3 = integer%10;
        int reverse2 = (integer/10)%10;
        System.out.println("The reverse of " + integer + " is: " + reverse3 + reverse2 + reverse15);
    }
}