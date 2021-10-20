package com.thuntm2008110212.lab6;

public class Square {
    String sound = "Reng Reng";
    Boolean click = false;
    Square(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click == true)
            System.out.println("Xoay hình vuông 360 độ !!! ");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + sound + " !!! ");
    }
}
