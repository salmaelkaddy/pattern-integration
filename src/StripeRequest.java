public class StripeRequest {
    private double amount;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public StripeRequest(double amount,String cardNumber, String expiryDate, String cvv) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getAmount() {
        return amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public String getCvv() {
        return cvv;
    }

}
