package com.thuntm2008110212.lab6;

public class Circle {
    String sound = "Reng";
    Boolean click = false;
    Circle(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click== true)
            System.out.println("Xoay hình tròn 360 độ !!");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + sound + " !!! ");
    }

}
