import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Calum", "HG234567B", 100.00);
    }

    @Test
    public void hasName(){
        assertEquals("Calum", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Fraser");
        assertEquals("Fraser", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("HG234567B", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(100.00);
        assertEquals(200.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(1, developer.payBonus(), 0.01);
    }

}
