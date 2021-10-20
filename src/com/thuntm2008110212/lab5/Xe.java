package com.thuntm2008110212.lab5;

public class Xe {
    String tenChuXe;
    String dongXe;
    String hangSX;
    double giayPhep;
    double dtXang;

    Xe(){
        tenChuXe = "Phạm Văn Thuận";
        dongXe = "Xe côn tay";
        hangSX = "Yamaha";
        giayPhep = 2019;
        dtXang = 2.25;
    }

    Xe(double a){
        tenChuXe = "Văn Thuận";
        dongXe = "Xe ga";
        hangSX = "Honda";
        giayPhep = 2020;
        dtXang = a;
    }
    Xe(double x , double y){
        tenChuXe = "Thuận";
        dongXe = "Xe số";
        hangSX = "Suzuki";
        giayPhep = x;
        dtXang = y;
    }

    void xuatThongTin(){
        System.out.println("Tên chủ xe: "+tenChuXe);
        System.out.println("Dòng xe: "+dongXe);
        System.out.println("Hãng xe: "+hangSX);
        System.out.println("Giấy phép sản xuất: Năm "+giayPhep);
        System.out.print("Dung tích bình xăng: "+dtXang);
        System.out.println(" lít");
    }
}
