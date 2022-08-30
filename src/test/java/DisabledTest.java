import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTest {

    @Test
    @Disabled
    void test1() {
        assertTrue(true);
    }

    @Test
    @Disabled("Any test here")
    void test2() {
        assertTrue(true);
    }
}
