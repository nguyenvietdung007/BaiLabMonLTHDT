package com.dungnv2008110007.tuan07;

public class Amoeba extends Shape {
    private int x, y;
    void setToaDo(int a, int b){
        x = a;
        y = b;
    }
    protected void xoay(){
        System.out.println("Hình xoay theo tọa độ x = "+x+" và y = "+y);
    }
}
