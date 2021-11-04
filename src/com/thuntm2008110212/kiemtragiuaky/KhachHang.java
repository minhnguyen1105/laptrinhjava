package com.thuntm2008110212.kiemtragiuaky;

public class KhachHang extends  Nguoi{
    public static void main(String[] args) {
        String tenCongTy;
    private double triGiaHoaDon;
    @Override
    public String toString() {
        return super.toString()+" "+tenCongTy+" "+triGiaHoaDon+" VND";
    }
    KhachHang(String hoTen,String diaChi,String tenCongTy,double triGiaHoaDon){
        super(hoTen,diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
}
