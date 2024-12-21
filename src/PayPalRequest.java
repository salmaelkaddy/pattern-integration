public class PayPalRequest {
    private double amount;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public PayPalRequest(double amount, String cardNumber, String expiryDate, String cvv) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    public double getAmount() {
        return amount;
    }

    public boolean setAmount(double amount) {
        this.amount = amount;
        return false;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }


}
