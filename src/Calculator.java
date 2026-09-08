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

        loops();
    }

    public static double calculateTotal(double price, int quantity) {
        double total = price * quantity;

        if (quantity >= 10) {
            total = total * 0.9;
        }

        return total;
    }
    public static void loops(){
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Doubling numbers:");
        int number = 1;
        while (number <= 1000) {
            System.out.println(number);
            number = number * 2;
        }

        String text = "Hello World";
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char letter = Character.toLowerCase(text.charAt(i));

            if (letter == 'a' ||
                    letter == 'e' ||
                    letter == 'i' ||
                    letter == 'o' ||
                    letter == 'u') {

                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        String role = "admin";

        // "admin" cannot be null, so calling equals() on it is safe even if role is null.
        if ("admin".equals(role)) {
            System.out.println("Access granted");
        }
    }
}