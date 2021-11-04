package com.thuntm2008110212.kiemtragiuaky;

public class HocVien extends Nguoi {
    public static void main(String[] args) {
        float diemMonhoc1;
     float diemMonhoc2;
    private static int soLuongHV;
    
    protected float diemTB(){
        return (diemMonhoc1+diemMonhoc2)/2;
    }
    @Override
    public String toString() {
        return super.toString()+" "+diemMonhoc1+" "+diemMonhoc2+" "+" Diem trung binh "+diemTB();
    }
    HocVien(String hoTen,String diaChi,float diemMonhoc1,float diemMonhoc2){
        super(hoTen, diaChi);
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }
}
