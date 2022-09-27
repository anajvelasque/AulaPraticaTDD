import static org.junit.Assert.*;

class dollar extends Money{

   private String currency;

    dollar(int amount, String currency){
      super(amount, currency);
   }

   public boolean equals (Object object){
      dollar dollar = (dollar) object;
      return amount == dollar.amount;
   }
}