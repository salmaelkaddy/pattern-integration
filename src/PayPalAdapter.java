public class PayPalAdapter implements PaymentGateway {
    private PayPalGateway paypalGateway;

    public PayPalAdapter(PayPalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }
    @Override
    public boolean processPayment(double amount, String cardNumber, String expiryDate, String cvv) {
        PayPalRequest paypalRequest = new PayPalRequest(amount, cardNumber, expiryDate, cvv);
        return paypalGateway.processPayment(paypalRequest);
    }

}
