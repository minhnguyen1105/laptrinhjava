package com.thuntm2008110212.kiemtragiaky;

public class DanhSachQuanLi {
    public static void main(String[] args) {
    private ArrayList<Object> list = new ArrayList<Object>();
    public void themNguoi(Object object){
        list.add(object);
    }
    public void inList(){
        for(Object obj: list){
            System.out.println(obj.toString());
        }
        
    }
 }
}
