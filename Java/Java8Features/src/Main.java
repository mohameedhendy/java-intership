import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Product.addDummyData();

        // Exercise 1
        List<Product> books = new ArrayList<>();
        products.forEach(product -> {
            if ("Books".equals(product.getCategory())) {
                books.add(product);
            }
        });
        System.out.println("Books: " + books);

        // Exercise 2
        List<Product> expensiveBooks = new ArrayList<>();
        books.forEach(book -> {
            if (book.getPrice() > 100) {
                expensiveBooks.add(book);
            }
        });
        System.out.println("Expensive Books: " + expensiveBooks);

        // Exercise 3
        List<Product> discountedToys = new ArrayList<>();
        products.forEach(product -> {
            if ("Toys".equals(product.getCategory())) {
                Product discountedProduct = new Product(
                        product.getProductId(),
                        product.getProductName(),
                        product.getCategory(),
                        product.getPrice() * 0.9
                );
                discountedToys.add(discountedProduct);
            }
        });
        System.out.println("Discounted Toys: " + discountedToys);

        // Exercise 4
        Product cheapestBook = null;
        for (Product book : books) {
            if (cheapestBook == null || book.getPrice() < cheapestBook.getPrice()) {
                cheapestBook = book;
            }
        }
        System.out.println("Cheapest Book: " + (cheapestBook != null ? cheapestBook : "No books found"));
    }
}
