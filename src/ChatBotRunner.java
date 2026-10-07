import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 42);

        Scanner myScanner = new Scanner(System.in);

        System.out.println("State your name: ");
        String userName = myScanner.nextLine();
        debbie.greeting(userName);

        System.out.println("What is your favorite number? ");
        int favNum = myScanner.nextInt();
        debbie.favoriteNumber(favNum);

        System.out.println("I'll add 3 numbers for you! ");
        int num1 =myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int num3 = myScanner.nextInt();
        System.out.println("Your number is = " + debbie.addNumbers(num1, num2, num3));

        debbie.weather();

        System.out.println(debbie.goodbye());
    }
}
