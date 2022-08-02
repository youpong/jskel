import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MainTest {
    @BeforeAll
    public static void setupAll() {
    }

    @BeforeEach
    public void setup() {
    }

    @Test
    public void test() {
        String actual = "Hiroaki Oka";

        Assertions.assertEquals("Hiroaki Oka", actual);
        assertThat(actual, is("Hiroaki Oka"));
    }

    @Test
    public void throwTest() {
        Exception e = Assertions.assertThrows(Exception.class, () -> {
            throw new Exception("not supported");
        });
        Assertions.assertEquals("not supported", e.getMessage());
    }

    @Test
    @Disabled("until bug #XX fixed")
    public void disabledTest() {
        Assertions.assertTrue(false);
    }
}
