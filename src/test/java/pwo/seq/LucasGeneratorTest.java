package pwo.seq;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LucasGeneratorTest {
    @Test
    public void testReset() {
        System.out.println("reset");
        LucasGenerator instance = new LucasGenerator();
        instance.reset();
        BigDecimal expResult = new BigDecimal(2);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");
        LucasGenerator instance = new LucasGenerator();
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    @Test
    public void testPreviousTerm() {
        System.out.println("getTerm");
        LucasGenerator instance = new LucasGenerator();
        BigDecimal expResult = new BigDecimal(123);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);
    }
}