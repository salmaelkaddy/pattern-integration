//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = Order.getInstance();
        Drink espresso = new Espresso();
        Drink espressoWithMilk = new AddingMilk(espresso);
        order.addDrink(espressoWithMilk);
        System.out.println(order.getTotalPrice());

        }
    }
