import static org.junit.Assert.*;

public class Testes
{
    public void testMultiplication()
    {
        dollar five = new dollar(5);
        assertEquals(new dollar(10), five.times(2));
        assertEquals(new dollar(15), five.times(3));

        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }


    public void testEquality() {
        assertTrue(new dollar(5).equals(new dollar(5)));
        assertFalse(new dollar(5).equals(new dollar(6)));
        assertFalse(new Franc(5).equals(new dollar(5)));

        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    public void testCurrency() {
        assertEquals("USd", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}