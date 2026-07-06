public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println();
        manager.displayInventory();

        System.out.println();
        manager.updateProduct(102, "Wireless Mouse", 40, 750);

        System.out.println();
        manager.displayInventory();

        System.out.println();
        manager.deleteProduct(103);

        System.out.println();
        manager.displayInventory();
    }
}

class InventoryManager {
    private java.util.List<Product> products = new java.util.ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void displayInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    void updateProduct(int productId, String name, int quantity, int price) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setName(name);
                product.setQuantity(quantity);
                product.setPrice(price);
                break;
            }
        }
    }

    void deleteProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }
}

class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;

    Product(int id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}