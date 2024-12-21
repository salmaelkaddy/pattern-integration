import java.util.ArrayList;
import java.util.List;

public class Order {
   //->>> //1. Private Data Member
    private static Order instance;
    private PaymentGateway paymentGateway;



    private List<Drink> drinks = new ArrayList<>();

   //--> //2. Private Constructor
    private Order() {

    }

    //3. Public Factory Method
    public static synchronized Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;

    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Drink drink : drinks) {
            totalPrice+=drink.getCost();
        }
        return totalPrice;
    }

    public void setPaymentAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(double amount, String cardNumber, String expiryDate, String cvv) {
        if (paymentGateway != null) {
            return paymentGateway.processPayment(amount, cardNumber, expiryDate, cvv);
        } else {
            System.out.println("Payment Gateway not set.");
            return false;
        }
    }
}
