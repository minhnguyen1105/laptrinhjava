package com.thuntm2008110212.lab1;

public class bai3 {
    public static void main(String[] args) {
        Float Canh, TheTich;
        System.out.println( "Nhap canh khoi lap phuonng : ");
        Scanner input = new Scanner(System.in);
        Canh = input.nextFloat();
        TheTich = Canh*Canh*Canh;
        System.out.println("The tich khoi lap phuong la : "+ TheTich );
    }
}
