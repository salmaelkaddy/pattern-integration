***Scenario***


A coffee shop wants to create a mobile application that allows customers to order and customize their drinks. The application should be flexible enough to accommodate new drink types and customizations in the future.


***Requirements***
1. Singleton Pattern (Managing App State): Ensure that only one instance of the Order Class exists throughout the application, preventing multiple orders from being processed simultaneously for a single customer.

2. Decorator Pattern (Customizing Drinks): Allow customers to customize their drinks with various add-ons (as milk, sugar, whipped cream) without modifying the core Drink class.

3. Builder Pattern (Building Order step-by-step): The Builder pattern is ideal for creating complex objects step-by-step. In our coffee shop application, we can use it to construct a DrinkOrder object, allowing customers to customize their drinks in a flexible way.

4. Adapter Pattern (Integrating Third-Party Services): Create a PaymentAdapter interface for defining methods of payments with two different payment gateways (StripeAdapter, PayPalAdapter).

5. Proxy Pattern (Control Access to Resources): Create a DrinkImageProxy interface that fetches & caches drink images. The proxy can implement lazy loading, error handling, and caching mechanisms to optimize image loading.
