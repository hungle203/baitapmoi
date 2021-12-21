import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    private ArrayList<Candy> candies;
    private final Scanner scanner = new Scanner(System.in);

    public CandyManager() {
        this.candies = new ArrayList<>();
    }

    public void displayAll() {
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public Candy CandyUpdate(int id) {
        Candy candyUpdate = null;
        for (Candy candy : candies) {
            if (candy.getId() == id) {
                candyUpdate = candy;
            }
        }
        if (candyUpdate != null) {
            System.out.println("Nhập vào màu mới: ");
            String color = scanner.nextLine();
            candyUpdate.setColor(color);
            System.out.println("Nhập vào giá mới: ");
            double price = scanner.nextDouble();
            candyUpdate.setPrice(price);
            return candyUpdate;
        }
        return null;
    }

    public Candy displayByColor(int id) {
        System.out.println("Nhập vào màu muốn tìm: ");
        for (Candy candy : candies) {
            if (candy.getId() == id) {
                return candy;
            }
        }
        return null;
    }
    public Candy deleteById(int id) {
        Candy candy = null;
        for (Candy candy1: candies) {
            if (candy1.getId() == id) {
                candy = candy1;
            }
        }
        candies.remove(candy);
        return candy;
    }

    public void findMaxPrice() {
        double maxPrice = 0;
        for (Candy c: candies) {
            if (c.getPrice() > maxPrice) {
                maxPrice = c.getPrice();
            }
        }
        System.out.println(maxPrice);
    }




    public Candy createCandy(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập vào id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào màu: ");
        String color = scanner.nextLine();
        System.out.println("Nhập vào số lượng: ");
        double quantily = scanner.nextDouble();
        System.out.println("Nhập vào giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Candy(id, color, quantily, price);
    }

}
