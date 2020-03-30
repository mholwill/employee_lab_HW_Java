import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Zsolt", "JS456789P", 100000.00, "Head Office", 10000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JS456789P", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(101000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(2000, director.payBonus(), 0.01);
    }

}
