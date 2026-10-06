import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginAppTest {
    @Test
    void validLoginShouldReturnTrue() {
        assertTrue(LoginApp.login("sherlin", "12345"));
    }

    @Test
    void invalidPasswordShouldReturnFalse() {
        assertFalse(LoginApp.login("sherlin", "wrong"));
    }

    @Test
    void invalidUsernameShouldReturnFalse() {
        assertFalse(LoginApp.login("wrong", "12345"));
    }

    @Test
    void nullInputShouldReturnFalse() {
        assertFalse(LoginApp.login(null, "12345"));
        assertFalse(LoginApp.login("sherlin", null));
        assertFalse(LoginApp.login(null, null));
    }
}
