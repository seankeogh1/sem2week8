import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


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
    @Test
    void testSubtractSuccess(){
        assertEquals(0,myCalc.subtract(4,4));
    }

    @Test
    void testSubtractFail(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myCalc.subtract(Integer.MIN_VALUE,4);});
        assertEquals("this value is too small", ex.getMessage());
    }
    @Test
    void testMultiplySuccess(){
        assertEquals(16,myCalc.multiply(4,4));
    }

    @Test
    void testMultiplyFail(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myCalc.multiply(Integer.MAX_VALUE,4);});
        assertEquals("this value is too big", ex.getMessage());
    }
    @Test
    void testDivideSuccess(){
        assertEquals(1,myCalc.divide(4,4));
    }
    @Test
    void testDivideFail(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myCalc.divide(Integer.MAX_VALUE,0);});
        assertEquals("this value is invalid", ex.getMessage());
    }
}
