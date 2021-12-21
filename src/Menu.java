import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        CandyManager candyManager = new CandyManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả kẹo");
            System.out.println("2. Thêm một viên kẹo");
            System.out.println("3. Sửa một viên kẹo theo id");
            System.out.println("4. Xóa một viên kẹo theo id");
            System.out.println("5. Hiển thị viên kẹo theo id");
            System.out.println("6. Tìm viên keo có giá cao nhất");
            System.out.println("7. Xóa tất cả các viên kẹo có màu");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    candyManager.displayAll();
                    break;
                case 2:
                    Candy candy = candyManager.createCandy(scanner);
                    System.out.println();
                    candyManager.addCandy(candy);
                    break;
                case 3:
                    System.out.println("Nhập vào id muốn sửa");
                    int id = scanner.nextInt();
                    System.out.println(candyManager.CandyUpdate(id));
                    break;
                case 4:
                    System.out.println("Nhập vào id muốn xóa");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(candyManager.deleteById(idDelete));
                    break;
                case 5:
                    System.out.println("Nhập vào id viên kẹo mà bạn muốn hiển thị");
                   int ide = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(candyManager.displayByColor(ide));
                    break;
                case 6:
                   candyManager.findMaxPrice();
                    break;
            }
        } while (choice != 0);
    }
}
