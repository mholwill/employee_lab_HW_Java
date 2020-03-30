import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Malcolm", "HG234567A", 1000.00, "Head Office");
    }

    @Test
    public void hasName(){
        assertEquals("Malcolm", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("HG234567A", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasdepartment(){
        assertEquals("Head Office", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100.00);
        assertEquals(1100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canHaveBonus(){
        assertEquals(10, manager.payBonus(), 0.01);
    }


}

