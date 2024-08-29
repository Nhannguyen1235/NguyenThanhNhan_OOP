public abstract class VatPham {
    protected String TenVatPham;
    protected int ChiSoSM;
    protected double HeSoSM;
    protected int Xu;

    public String getTenVatPham() {
        return TenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        TenVatPham = tenVatPham;
    }

    public int getChiSoSM() {
        return ChiSoSM;
    }

    public void setChiSoSM(int chiSoSM) {
        ChiSoSM = chiSoSM;
    }

    public double getHeSoSM() {
        return HeSoSM;
    }

    public void setHeSoSM(double heSoSM) {
        HeSoSM = heSoSM;
    }

    public int getXu() {
        return Xu;
    }

    public void setXu(int xu) {
        Xu = xu;
    }

    public void nhap() {
        System.out.println("Nhập chỉ số sức mạnh: ");
        ChiSoSM = new java.util.Scanner(System.in).nextInt();
        System.out.println("Nhập hệ số sức mạnh: ");
        HeSoSM = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Nhập xu/ 1 sức công phá: ");
        Xu = new java.util.Scanner(System.in).nextInt();
    }
    public void xuat() {
        System.out.println("Tên vật phẩm: " + TenVatPham);
        System.out.println("Chỉ số sức mạnh: " + ChiSoSM);
        System.out.println("Hệ số sức mạnh: " + HeSoSM);
        System.out.println("Xu/ 1 sức nguồn: " + Xu);
    }
    public abstract double SucCongPha();
}
