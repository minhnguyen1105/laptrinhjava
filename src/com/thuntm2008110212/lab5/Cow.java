package com.thuntm2008110212.lab5;

public class Cow {
    double weight;
    double age;
    Cow(){
        weight = 15;
        age = 1;
    }
    
    Cow(double x){
        weight = x;
        age = 2;
    }
    Cow(double y, double z){
        weight = y;
        age = z;
    }
    void xuatThongTin(){
        System.out.print("Cân nặng: "+weight);
        System.out.println(" kg");

        System.out.print("Tuổi: "+age);
        System.out.println(" tuổi");
    }
}
