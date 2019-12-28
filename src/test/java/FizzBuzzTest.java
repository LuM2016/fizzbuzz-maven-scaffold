import junit.framework.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_Fizz_given_multiple_of_3() {
        Assert.assertEquals("Fizz", FizzBuzz.of(3));
    }

    @Test
    public void should_return_Fizz_given_multiple_of_5() {
        Assert.assertEquals("Buzz", FizzBuzz.of(5));
    }
}
