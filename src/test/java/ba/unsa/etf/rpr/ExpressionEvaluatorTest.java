package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionEvaluatorTest {
    ExpressionEvaluator ti = new ExpressionEvaluator();
    @Test
    void testIzuzetak() {
        assertThrows(RuntimeException.class, () -> {ti.evaluate("( 1 + ( (2 + 3 ) * ( 4 * 5 ) ) )"); });
    }
    @Test
    void testDecimal(){
        assertEquals(-1881.96,ti.evaluate("( 55 - ( ( 5 + 3 ) * ( 4 * 60.53 ) ) )"));
    }
    @Test
    void testInt(){
        assertEquals(101,ti.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"));
    }
    @Test
    void testInt2(){
        assertEquals(3192,ti.evaluate("( ( 2 + ( 4 * 9 ) ) * ( 6 + ( ( 9 * 8 ) + 6 ) ) )"));
    }
    @Test
    void testZagrade(){
        //Višak zagrada
        assertThrows(RuntimeException.class,()->{ti.evaluate("(( 1 + ( (2 + 3 ) * ( 4 * 5 ) ) )");});
    }
    @Test
    void testDjeljenje()
    {
        assertEquals(0.4523809523809524,ti.evaluate("( ( 2 + ( 4 * 9 ) ) / ( 6 + ( ( 9 * 8 ) + 6 ) ) )"));
    }
}