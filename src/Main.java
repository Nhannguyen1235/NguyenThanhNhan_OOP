import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachVatPham dsVatPham = new DanhSachVatPham();
        while (true) {
            System.out.println("1. Nhập vật phẩm");
            System.out.println("2. Xuất vật phẩm");
            System.out.println("3. Vật phẩm cần nhiều xu nhất");
            System.out.println("4. Giải cứu");
            System.out.println("5. Thoát");

            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    dsVatPham.nhap();
                    break;
                case 2:
                    dsVatPham.xuat();
                    break;
                case 3:
                    dsVatPham.maxXu();
                    break;
                case 4:
                    dsVatPham.giacuu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui lý chọn lại!");
                }
            }
        }
    }