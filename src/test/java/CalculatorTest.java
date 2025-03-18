import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    Calculator myCalc;


    @BeforeEach
    void setup()
    {

        myCalc = new Calculator();
    }
    @Test
    void testAddSuccess(){

        assertEquals(8,myCalc.add(4,4));
    }
    @Test
    void testAddFail(){
         Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myCalc.add(Integer.MAX_VALUE,4);});
        assertEquals("this value is too big", ex.getMessage());

    }
}
