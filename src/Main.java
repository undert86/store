

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Создание товаров
        Product product1 = new ProductImpl("Товар 1", 100.0, 4);
        Product product2 = new ProductImpl("Товар 2", 200.0, 5);
        Product product3 = new ProductImpl("Товар 3", 300.0, 3);

        Category category1 = new CategoryImpl("Категория 1", new Product[]{product1, product2});
        Category category2 = new CategoryImpl("Категория 2", new Product[]{product3});

        User user1 = new UserImpl("user 1", "password1");
        User user2 = new UserImpl("user 2", "password2");
        User user3 = new UserImpl("user 3", "password3");
        User user4 = new UserImpl("user 4", "password4");
        User user5 = new UserImpl("user 5", "password5");

        user1.getBasket().addProduct(product1);
        user2.getBasket().addProduct(product2);
        user3.getBasket().addProduct(product3);
        user4.getBasket().addProduct(product1);
        user4.getBasket().addProduct(product2);
        user5.getBasket().addProduct(product3);

        System.out.println("Каталог продуктов:");
        System.out.println("Категория 1:");
        for (Product product : category1.getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + "руб. Рейтинг: " + product.getRating());
        }
        System.out.println("Категория 2:");
        for (Product product : category2.getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + "руб. Рейтинг: " + product.getRating());
        }
        System.out.println("Содержимое корзин пользователей:");
        System.out.println("Пользователь 1:");
        for (Product product : user1.getBasket().getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + " руб. - Рейтинг: " + product.getRating());
        }
        System.out.println("Пользователь 2:");
        for (Product product : user2.getBasket().getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + " руб. - Рейтинг: " + product.getRating());
        }
        System.out.println("Пользователь 3:");
        for (Product product : user3.getBasket().getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + " руб. - Рейтинг: " + product.getRating());
        }
        System.out.println("Пользователь 4:");
        for (Product product : user4.getBasket().getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + " руб. - Рейтинг: " + product.getRating());
        }
        System.out.println("Пользователь 5:");
        for (Product product : user5.getBasket().getProducts()) {
            System.out.println(product.getName() + "-" + product.getPrice() + " руб. - Рейтинг: " + product.getRating());
        }

    }
}