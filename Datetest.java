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

    @Test
    void dernierJour() {
        // Test for February in a leap year
        assertEquals(29, Date.dernierJour(2020, 2));
        
        // Test for February in a non-leap year
        assertEquals(28, Date.dernierJour(2021, 2));
        
        // Test for April
        assertEquals(30, Date.dernierJour(2022, 4));
    }


    
}