package attestation.attestation1.test;

import attestation.attestation1.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @org.junit.Test
    public void testUserCreation() {
        User user = new User(null, null, "Ivan_123", "pass_1234", "pass_1234",
                "Иван", "Иванов", "Иванович", 30, true);

        assertNotNull(user.getId());
        assertNotNull(user.getDateTime());
        assertEquals("Ivan_123", user.getLogin());
        assertEquals("Иван", user.getFirstName());
        assertEquals("Иванов", user.getLastName());
        assertEquals("Иванович", user.getMiddleName());
        assertEquals(30, user.getAge());
        assertTrue(user.isWorker());
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getDateTime() {
    }

    @Test
    void setDateTime() {
    }

    @Test
    void getLogin() {
    }

    @Test
    void setLogin() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void setPassword() {
    }

    @Test
    void getConfirmPassword() {
    }

    @Test
    void setConfirmPassword() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getFirstName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getMiddleName() {
    }

    @Test
    void setMiddleName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void isWorker() {
    }

    @Test
    void setWorker() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}