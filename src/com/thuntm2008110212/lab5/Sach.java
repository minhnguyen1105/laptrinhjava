package com.thuntm2008110212.lab5;

public class Sach {
    
    String nhaXuatBan;
    double namXuatBan;
    double giaBan;
    String loai;

   
    Sach(){
        loai = "Sách Khoa Học";
        nhaXuatBan = "NXB Văn Hóa Nghệ Thuật";
        namXuatBan = 1998;
        giaBan = 50000;
    }
    
    Sach(double a){
        loai = "Sách Giáo Dục";
        nhaXuatBan = "NXB Văn Học";
        namXuatBan = 1999;
        giaBan = a;
    }
    
    Sach(double m, double n){
        loai = "Sách tuổi trẻ";
        nhaXuatBan = "NXB Tuổi trẻ";
        namXuatBan = m;
        giaBan = n;
    }

    void xuatThongTin(){
        System.out.println("Loại Sách: "+loai);
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm xuất bản: "+namXuatBan);
        System.out.println("Giá bán: "+giaBan);
    }

    double thanhTien(int soLuong){
        double tien;
        tien = soLuong*giaBan;
        return tien;
    }
}
