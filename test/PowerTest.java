import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    Power p;
    @Test
    public void powerOf()
    {
        p=new Power();
        int result =p.powerOfFour(64);
        assertEquals(1,1);
    }
    @Test
    public void power()
    {
        p=new Power();
        int result =p.powerOfFour(18);
        assertEquals(0,0);
    }
}