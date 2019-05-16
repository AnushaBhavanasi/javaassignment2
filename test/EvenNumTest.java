import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
        EvenNum en;
        @Test
        public void getNum()
    {
        en=new EvenNum();
        boolean result=en.isEven(31);
        assertEquals("false","false");
    }
    @Test
    public void oddNum()
    {
        en=new EvenNum();
        boolean result=en.isEven(30);
        assertEquals("true","true");
    }
}