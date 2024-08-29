public class HonDaKichNo extends VatPham {
    public HonDaKichNo(){
        this.TenVatPham = "Hòn đá kích nổ";
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
