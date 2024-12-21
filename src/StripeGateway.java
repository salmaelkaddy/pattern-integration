public class StripeGateway {

    double available_balance = 200;

    public boolean processPayment(StripeRequest stripeRequest) {
       if(stripeRequest.getAmount() < available_balance){
           return true;
       }else{
           return false;
       }
    }
}
