public class CayGayChienThan extends VatPham {
    public CayGayChienThan(){
        this.TenVatPham = "Cây gậy chiến thần";
    }
    public void nhap() {
        super.nhap();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Sức công phá của "+this.TenVatPham + ": " + this.SucCongPha());
    }

    public double SucCongPha() {
        return this.getChiSoSM() * this.getHeSoSM();
    }
}
