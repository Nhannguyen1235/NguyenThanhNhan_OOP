import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachVatPham dsVatPham = new DanhSachVatPham();
        dsVatPham.nhap();
        while (true) {
            System.out.println("1. Xuất vật phẩm");
            System.out.println("2. Vật phẩm cần nhiều xu nhất");
            System.out.println("3. Giải cứu");
            System.out.println("4. Thoát");

            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    dsVatPham.xuat();
                    break;
                case 2:
                    dsVatPham.maxXu();
                    break;
                case 3:
                    dsVatPham.giacuu();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn lại!");
                }
            }
        }
    }