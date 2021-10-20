package com.thuntm2008110212.lab5;

public class Taikhoan {
    String tenTK;
    int soTK;
    int soDu;

    TaiKhoan(){
        tenTK = "Nguyễn Trần Minh Thư";
        soTK = 78981981;
        soDu = 1500000;
    }
    TaiKhoan(int g){
        tenTK = "Thư";
        soTK = 78981981;
        soDu = g;
    }
    TaiKhoan(int b, int c){
        tenTK = "Minh Thư";
        soTK = b;
        soDu = c;
    }

    void xuatThongTin(){
        System.out.println("Tên chủ tài khoản: "+tenTK);
        System.out.println("Số tài khoản: "+soTK);
        System.out.println("Số dư trong tài khoản: "+soDu);
    }

    int guiTien(int gui){
        soDu = soDu + gui;
        return soDu;
    }
    int rutTien(int rut){
        soDu = soDu - rut;
        return soDu;
    }
}
