public interface PaymentGateway {
    boolean processPayment(double amount, String cardNumber, String expiryDate, String cvv);

}
