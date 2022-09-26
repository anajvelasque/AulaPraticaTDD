abstract class Money{

    protected int amount;
     Money times(int multiplier)
    {
        return Money.dollar(amount * multiplier);
    }
    protected String currency;
    
    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount)  {
        return new Dollar(amount, "USD");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    String currency() {
        return currency;
    }
}