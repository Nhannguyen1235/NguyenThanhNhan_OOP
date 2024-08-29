import java.util.ArrayList;
import java.util.List;

public class DanhSachVatPham {

    List<VatPham> dsVatPham = new java.util.ArrayList<>();
    public List<VatPham> getDsVatPham() {
        return dsVatPham = new ArrayList<>() ;
    }

    public void nhap() {
        try {
            System.out.println("Nhập thông tin vật phẩm!!!");
            System.out.println("Chiếc búa thần:");
            ChiecBuaThan chiecBuaThan = new ChiecBuaThan();
            chiecBuaThan.nhap();
            dsVatPham.add(chiecBuaThan);

            System.out.println("Cây gậy chiến thần:");
            CayGayChienThan cayGayChienThan = new CayGayChienThan();
            cayGayChienThan.nhap();
            dsVatPham.add(cayGayChienThan);

            System.out.println("Cây rìu phép thuật:");
            CayRiuPhepThuat cayRiuPhepThuat = new CayRiuPhepThuat();
            cayRiuPhepThuat.nhap();
            dsVatPham.add(cayRiuPhepThuat);

            System.out.println("Bao tay sấm sét:");
            BaoTaySamSet baoTaySamSet = new BaoTaySamSet();
            baoTaySamSet.nhap();
            dsVatPham.add(baoTaySamSet);

            System.out.println("Hòn đá kích nổ:");
            HonDaKichNo honDaKichNo = new HonDaKichNo();
            honDaKichNo.nhap();
            dsVatPham.add(honDaKichNo);

        } catch (Exception e) {
            System.out.println("Lỗi nhập liệu, vui lòng nhập lại!!!");
        }
    }

    public void xuat() {
        for (VatPham vatPham : dsVatPham) {
            vatPham.xuat();
        }
    }

    // vật phẩm cần nhiều xu nhất
    public void maxXu() {
        int max = 0;
        for (VatPham vatPham : dsVatPham) {
            if (vatPham.getXu() > max) {
                max = vatPham.getXu();

            }
        }
        // in  ra thông tin vật phẩm đó
        for (VatPham vatPham : dsVatPham) {
            if (vatPham.getXu() == max) {
                System.out.println("Vật phẩm cần tốn nhiều xu nhất là: ");
                vatPham.xuat();
            }
        }
    }
    // tính sức công pha cần để giải cứu = (chỉ số SM + he sơ SM)* xu/ 1 sức công phá
    public void giacuu() {
        System.out.println("Nhập số xu thu thập được: ");
        int xu = new java.util.Scanner(System.in).nextInt();
        while (true){
            System.out.println("Chọn loại vũ khí: ");
            System.out.println("1. Cây rìu phép thuật");
            System.out.println("2. Cây gậy chiến thần");
            System.out.println("3. Chiếc búa thần");
            System.out.println("4. Bao tay sấm sét");
            System.out.println("5. Hòn đá kích nổ");
            System.out.println("6. Nhập lại số xu thu thập được");
            System.out.println("7. Thoát");

            int choice = new java.util.Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    sucManhVuKhi(xu, "Cây rìu phép thuật");
                    break;
                case 2:
                    sucManhVuKhi(xu, "Cây gậy chiến thần");
                    break;
                case 3:
                    sucManhVuKhi(xu, "Chiếc búa thần");
                    break;
                case 4:
                    sucManhVuKhi(xu, "Bao tay sấm sét");
                    break;
                case 5:
                    sucManhVuKhi(xu, "Hòn đá kích nổ");
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lý chọn lại!");
            }
        }
    }
    // tính số sức mạnh cần của từng vũ khí để giải cứu
    public void sucManhVuKhi(int xu, String loaiVatPham) {
        int soSuVangCanCo = 0;
        for (VatPham vatPham : dsVatPham) {
            if (vatPham.getTenVatPham().equals(loaiVatPham)) {
                soSuVangCanCo += vatPham.SucCongPha() * vatPham.getXu();
            }
        }
        if(xu >= soSuVangCanCo) {
            System.out.println("Giải cứu thành công!!!");
        } else {
            System.out.println("Giải cứu thất bại");
        }
    }
}