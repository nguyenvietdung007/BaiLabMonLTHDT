package com.dungnv2008110007.tuan05;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        sach.gioiThieuSach();
        System.out.println("Tổng tiền 3 cuốn sách là: "+sach.thanhTien(3));
        sach = new Sach(25000);
        sach.gioiThieuSach();
        System.out.println("Tổng tiền 4 cuốn sách là: "+sach.thanhTien(4));
        sach = new Sach(2021, 48000);
        sach.gioiThieuSach();
        System.out.println("Tổng tiền 5 cuốn sách là: "+sach.thanhTien(5));
    }
}
