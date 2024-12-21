public class StripeAdapter implements PaymentGateway {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public boolean processPayment(double amount, String cardNumber, String expiryDate, String cvv) {
        StripeRequest stripeRequest = new StripeRequest(amount,cardNumber, expiryDate, cvv);
        return stripeGateway.processPayment(stripeRequest);
    }
}
