public class Candy {
    public static int VALUE = 0;
    private int id;
    private String color;
    private double quantily;
    private double price;

    public Candy() {
    }

    public Candy(int id, String color, double quantily, double price) {
        this.id = ++VALUE;
        this.color = color;
        this.quantily = quantily;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getQuantily() {
        return quantily;
    }

    public void setQuantily(double quantily) {
        this.quantily = quantily;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", quantily=" + quantily +
                ", price=" + price +
                '}';
    }
}
