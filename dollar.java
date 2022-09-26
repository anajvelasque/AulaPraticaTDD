import static org.junit.Assert.*;

class Dollar extends Money{

   private String currency;

    Dollar(int amount, String currency){
      super(amount, currency);
   }

   public boolean equals (Object object){
      Dollar dollar = (Dollar) object;
      return amount == dollar.amount;
   }
}