package com.thuntm2008110212.lab5;

public class XeTestDrive {
    public static void main(String[] args) {
    
        Xe xe;
        xe = new Xe();
        xe.xuatThongTin();

        xe = new Xe(1.75);
        xe.xuatThongTin();

        xe = new Xe(2020,2.75);
        xe.xuatThongTin();
        }
}
