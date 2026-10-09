public class LuckyNumbers {

    public LuckyNumbers() {

    }

    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * (max-min+1)) + min;
    }

    public void getLuckyNumbers() {
        int ln1 = randomIntegerBetween(1, 65);
        int ln2 = randomIntegerBetween(1, 65);
        int ln3 = randomIntegerBetween(1, 65);
        int ln4 = randomIntegerBetween(1, 65);
        int ln5 = randomIntegerBetween(1, 65);
        int sbn = randomIntegerBetween(0, 30);
        System.out.println("Your Lucky Numbers are: " + ln1 + " " + ln2 + " " + ln3 + " " + ln4 + " " + ln5);
        System.out.println("The super ball is: " + sbn);
    }
}
