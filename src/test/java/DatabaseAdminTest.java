import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Roosa", "HG234567C", 10000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Roosa", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("HG234567C", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(100.00);
        assertEquals(10100.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(100, databaseAdmin.payBonus(), 0.01);
    }

}
