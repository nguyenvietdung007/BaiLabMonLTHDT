package com.dungnv2008110007.tuan06;

public class CircleTestDrive {
    public static void main(String[] args) {
        Circle circle;
        circle = new Circle(true, 8, "ùn ùn ùn ...");
        if(circle.nhapChuotChua == true){
            circle.xoay(360);
            circle.phatAmThanh();
        }
        else
            System.out.println("Bạn chưa nhấp chuột lên Circle");
    }
}
