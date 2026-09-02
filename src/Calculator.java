public class Calculator {
    public static void main(String[] args) {
        String name = "apple";
        char category = 'a';
        boolean inStock = true;
        int amount = 50;
        double price = 1111.11;
        System.out.println(
                "Product: " + name +
                        ", Quantity: " + amount +
                        ", Price: " + price +
                        ", In stock: " + inStock +
                        ", Category: " + category
        );

        System.out.println(calculateTotal(100, 5));
        System.out.println(calculateTotal(100, 10));
        System.out.println(calculateTotal(50.5, 3));
        System.out.println(calculateTotal(-100, 5));
    }

    public static double calculateTotal(double price, int quantity) {
        double total = price * quantity;

        if (quantity >= 10) {
            total = total * 0.9;
        }

        return total;
    }
}