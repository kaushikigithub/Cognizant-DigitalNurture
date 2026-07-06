import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Product("Laptop", "Electronics");
        products[1] = new Product("Shoes", "Fashion");
        products[2] = new Product("Mobile", "Electronics");
        products[3] = new Product("Watch", "Accessories");
        products[4] = new Product("Keyboard", "Electronics");

        SearchService searchService = new SearchService();

        System.out.println("Linear Search Result:");
        Product linearResult = searchService.linearSearch(products, "Mobile");

        if (linearResult != null) {
            linearResult.displayProduct();
        } else {
            System.out.println("Product not found.");
        }

        Arrays.sort(products, Comparator.comparing(product -> product.productName.toLowerCase()));

        System.out.println("\nBinary Search Result:");
        Product binaryResult = searchService.binarySearch(products, "Mobile");

        if (binaryResult != null) {
            binaryResult.displayProduct();
        } else {
            System.out.println("Product not found.");
        }
    }
}