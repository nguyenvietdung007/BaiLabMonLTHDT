package com.dungnv2008110007.tuan05;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe();
        xe.inThongTin();
        xe = new Xe(6);
        xe.inThongTin();
        xe = new Xe(1000, 15);
        xe.inThongTin();
    }
}
