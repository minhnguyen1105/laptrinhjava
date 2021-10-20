package com.thuntm2008110212.lab5;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();
        cow.xuatThongTin();

        cow = new Cow(6);
        cow.xuatThongTin();

        cow = new Cow(6,3);
        cow.xuatThongTin();

    }
}
