package com.thuntm2008110212.kiemtragiaky;

public class NhanVien extends Nguoi {
    public static void main(String[] args) {
        float heSoLuong;
        float tinhLuong(){
            return heSoLuong*1500000;
        }
        @Override
        public String toString() {
            return super.toString()+" "+tinhLuong()+ " VND";
        }
        NhanVien(String hoTen,String diaChi,float heSoLuong){
            super(hoTen,diaChi);
            this.heSoLuong = heSoLuong;
    }
}
