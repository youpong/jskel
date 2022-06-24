import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MainTest {
    @BeforeAll
    public static void setupAll() {
    }

    @BeforeEach
    public void setup() {
    }

    @Test
    public void test() {
        Assertions.assertTrue(true);
    }

    @Test
    public void throwTest() {
        Exception e = Assertions.assertThrows(Exception.class, () -> {
            throw new Exception("not supported");
        });
        Assertions.assertEquals("not supported", e.getMessage());
    }
}
