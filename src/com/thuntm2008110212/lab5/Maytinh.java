package com.thuntm2008110212.lab5;

public class Maytinh {
    tring nhaSX;
    double namSX;
    String heDieuHanh;
    double ram;
    String cPU;
    double gia;
    double namBH;
    MayTinh(){
        nhaSX = "Lenovo";
        namSX = 2021;
        heDieuHanh = "Windows 10";
        ram = 8;
        cPU = "Intel Core i7 11600";
        gia = 16;
        namBH = 2021;
    }
    MayTinh(double a){
        nhaSX = "HP";
        namSX = 2019;
        heDieuHanh = "Windows 10";
        ram = 8;
        cPU = "Intel Core i3 9700";
        gia = a;
        namBH = 2020;
    }

    MayTinh(double h, double k){
        nhaSX = "Dell";
        namSX = 2021;
        heDieuHanh = "Windows 10";
        ram = h;
        cPU = "Intel Core i7 11700K";
        gia = k;
        namBH = 2021;
    }

    void xuatThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSX);
        System.out.println("Năm sản xuất: "+namSX);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.print("Ram: "+ram);
        System.out.println("GB");
        System.out.println("CPU: "+cPU);
        System.out.print("Giá bán: "+gia);
        System.out.println(" triệu đồng");
        System.out.println("Năm bảo hành: "+namBH);
    }
    double tinhTien(int soLuong){
        double tien;
        tien = soLuong*gia;
        return tien;
    }
}
