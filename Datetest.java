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


    @Test
    void compareTo() {
        Date date1 = new Date(2024, 3, 25);
        Date date2 = new Date(2024, 3, 26);
        Date date3 = new Date(2024, 3, 25);
        
        // Test for comparison when date1 is before date2
        assertTrue(date1.compareTo(date2) < 0);
        
        // Test for comparison when date2 is after date1
        assertTrue(date2.compareTo(date1) > 0);
        
        // Test for comparison when date1 is equal to date3
        assertEquals(0, date1.compareTo(date3));
    }

    @Test
    void dateDuLendemain() {
        Date date = new Date(2024, 3, 25);
        Date nextDay = date.dateDuLendemain();
        
        // Test for the next day
        assertEquals(26, nextDay.getJour());
        assertEquals(3, nextDay.getMois());
        assertEquals(2024, nextDay.getAnnee());
    }

    @Test
    void dateDeLaVeille() {
        Date date = new Date(2024, 3, 25);
        Date previousDay = date.dateDeLaVeille();
        
        // Test for the previous day
        assertEquals(24, previousDay.getJour());
        assertEquals(3, previousDay.getMois());
        assertEquals(2024, previousDay.getAnnee());
    }
}