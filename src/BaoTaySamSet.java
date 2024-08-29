public class BaoTaySamSet extends VatPham {
    public BaoTaySamSet(){
        this.TenVatPham = "Bao tay sấm sét";
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
