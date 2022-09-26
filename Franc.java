import static org.junit.Assert.*;

class Franc extends Money
{
    private int amount;
    private String currency;

    Franc(int amount, String currency)
    {
        super(amount, currency);
    }
    Money times(int multiplier)
    {
         return Money.franc(amount * multiplier);
    }

    String currency() {
        return currency;
    }
    
    public boolean equals(Object object)
    {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }






}