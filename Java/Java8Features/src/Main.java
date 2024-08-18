import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Product.addDummyData();

        // Exercise 1
        List<Product> books = products.stream()
                .filter(p -> p.getCategory().equals("Books"))
                .collect(Collectors.toList());
        System.out.println("Books: " + books);

        // Exercise 2
        List<Product> expensiveBooks = books.stream()
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
        System.out.println("Expensive Books: " + expensiveBooks);

        // Exercise 3
        List<Product> discountedToys = products.stream()
                .filter(p -> p.getCategory().equals("Toys"))
                .map(p -> new Product(p.getProductId(), p.getProductName(), p.getCategory(), p.getPrice() * 0.9))
                .collect(Collectors.toList());
        System.out.println("Discounted Toys: " + discountedToys);

        // Exercise 4
        Product cheapestBook = books.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
        System.out.println("Cheapest Book: " + cheapestBook);
    }
}
