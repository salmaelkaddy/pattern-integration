public class PayPalGateway {
    public boolean processPayment(PayPalRequest paypalRequest) {
        if (paypalRequest.setAmount(paypalRequest.getAmount())) {
            return true;
        }
        return false;
    }


}
