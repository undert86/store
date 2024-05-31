class ProductImpl implements Product{
    private String name;
    private double price;
    private int rating;
    public ProductImpl(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
