import java.util.Arrays;

public class BasketImpl implements Basket{

    private Product[] products;
    public BasketImpl() {
        products = new Product[0];
    }
    @Override
    public void addProduct(Product product) {
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;

    }

    @Override
    public Product[] getProducts() {
        return products;
    }
}
