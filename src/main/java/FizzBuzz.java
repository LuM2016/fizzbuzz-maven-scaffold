public class FizzBuzz {
    private static final int FIZZ_NUMBER = 3;

    public static String of(int number) {
        if (number % FIZZ_NUMBER == 0) {
            return "Fizz";
        }
        return null;
    }
}
