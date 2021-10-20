package com.thuntm2008110212.lab5;

public class Nhanvien {
    String tenNV;
    double luong;
    String ngaySinh;
    String diaChi;
    String boPhan;

    //methood - function
    //hàm tạo mặc định
    NhanVien(){
        tenNV = "Nguyễn Văn T";
        ngaySinh = "18/04/2002";
        diaChi = "Tp.HCM";
        boPhan = "Thu ngân";
        luong = 200000;
    }

    //hàm tạo 1 tham số
    NhanVien(Double a){
        tenNV = "Nguyễn Văn N";
        ngaySinh = "27/05/2002";
        diaChi = "Đ.Nai";
        boPhan = "phục vụ";
        luong = a;
    }

    void xuatThongTin(){
        System.out.println("Tên nhân viên: "+tenNV);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhan);
        System.out.println("Lương: "+luong);
    }

    double tinhLuong(int ngay){
        double tien;
        tien = ngay*luong;
        return tien;
    } 
}
