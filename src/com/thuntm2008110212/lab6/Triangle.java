package com.thuntm2008110212.lab6;

public class Triangle {
    String sound = "Reng Reng Reng";
    Boolean click = false;
    Triangle(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click == true)
            System.out.println("Xoay hình tam giác 360 độ : ");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + sound + " !!! " );
    }
}
