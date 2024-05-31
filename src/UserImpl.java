class UserImpl implements User{

    private String login;
    private String password;
    private Basket basket;

    public UserImpl(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new BasketImpl();
    }
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Basket getBasket() {
        return basket;
    }
}
