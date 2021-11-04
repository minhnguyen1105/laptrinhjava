package com.thuntm2008110212.kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy list = new DanhSachQuanLy();
        HocVien hocVien = new HocVien("Nguyen Tran Minh Thu","85/5", 8,9);
        NhanVien nhanVien = new NhanVien("Nguyen Ngoc Xuan Trinh", "100/8", 8);
        KhachHang khachHang = new KhachHang("Nguyen Van A", "100/9", "VN group", 3000000);
        list.themNguoi(hocVien);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inList();
    }
}
