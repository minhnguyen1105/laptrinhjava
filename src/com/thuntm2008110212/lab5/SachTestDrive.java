package com.thuntm2008110212.lab5;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        sach.xuatThongTin();
        System.out.println("Tổng tiền mua sách là: " +sach.thanhTien(2)+ " vnđ");

        sach = new Sach(32000);
        sach.xuatThongTin();
        System.out.println("Tổng tiền mua sách là: " +sach.thanhTien(2)+ " vnđ");

        sach = new Sach(2021,15000);
        sach.xuatThongTin();
        System.out.println("Tổng tiền mua sách là: " +sach.thanhTien(2)+ " vnđ");


    }
}
