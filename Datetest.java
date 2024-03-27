import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void bissextile() {
        // Test for a leap year
        assertTrue(Date.bissextile(2020));
        
        // Test for a non-leap year
        assertFalse(Date.bissextile(2021));
    }

    
}