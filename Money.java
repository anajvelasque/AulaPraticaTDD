class Money{

    protected int amount;
    protected String currency;

    static Money dollar(int amount)  {
        return new dollar(amount, "USD");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
     public boolean equals(Object object)
    {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    Money times(int multiplier)
    {
        return new Money(amount * multiplier, currency);
    }
    String currency() {
        return currency;
    }
}