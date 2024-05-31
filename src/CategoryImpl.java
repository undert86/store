public class CategoryImpl implements Category {
    private String name;
    private Product[] products;

    public CategoryImpl(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Product[] getProducts() {
        return products;
    }
}
