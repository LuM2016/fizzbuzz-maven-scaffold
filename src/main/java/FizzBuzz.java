public class FizzBuzz {
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;

    public static String of(int number) {
        if (number % FIZZ_NUMBER == 0 && number % BUZZ_NUMBER == 0) {
            return "FizzBuzz";
        }
        if (number % FIZZ_NUMBER == 0) {
            return "Fizz";
        }
        if (number % BUZZ_NUMBER == 0) {
            return "Buzz";
        }
        return String.format("%d", number);
    }
}
