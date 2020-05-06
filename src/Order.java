public class Order {

    private int numder;

    private int price;

    private int idClient;

    private boolean state;

    private Dish[] elementMenu;

    public Order(int idClient, Dish[] elementMenu) {
    }

    public Order(int idClient, Dish[] elementMenu, int discount) {
    }

    public boolean setInfo(boolean state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
