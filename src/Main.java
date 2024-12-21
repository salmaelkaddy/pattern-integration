//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Singleton + Decorator Pattern");
        System.out.println("---------------------------------------");
        Order order = Order.getInstance();



        Drink espresso = new Espresso();
        Drink espressoWithMilk = new AddingMilk(espresso);
        order.addDrink(espressoWithMilk);
        System.out.println(order.getTotalPrice());

        System.out.println("\nSingleton + Decorator + Builder Pattern");
        System.out.println("---------------------------------------");
        CoffeeBuilder builder = new CoffeeBuilder()
                .setType("Espresso")
                .addTopping("Milk")
                .addTopping("Sugar");

        Drink drink = builder.build();
        order.addDrink(drink);

        System.out.println("Total Cost: " + order.getTotalPrice());
        System.out.println("Order description: " + drink.getDescription());
        System.out.println("\nSingleton + Decorator + Builder + Proxy + Adapter Pattern");
        System.out.println("---------------------------------------");
        PaymentGateway paymentGateway = new StripeAdapter(new StripeGateway());

        // Process a payment
        boolean paymentSuccessful = paymentGateway.processPayment(order.getTotalPrice(), "1234567890123456", "12/25", "123");
        System.out.println("Payment successful: " + paymentSuccessful);

        // Load a drink image using the proxy pattern
        DrinkImage drinkImage = new DrinkImageProxy("https://example.com/coffee.jpg");
        BufferedImage image = drinkImage.getImage();
        }
    }
