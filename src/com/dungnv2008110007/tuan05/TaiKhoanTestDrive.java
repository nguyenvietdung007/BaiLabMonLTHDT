package com.dungnv2008110007.tuan05;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taiKhoan;
        taiKhoan = new TaiKhoan();
        taiKhoan.inThongTin();
        taiKhoan.guiTien(200);
        taiKhoan.inThongTin();
        taiKhoan.rutTien(300);
        taiKhoan.inThongTin();
        taiKhoan = new TaiKhoan(1111);
        taiKhoan.inThongTin();
        taiKhoan.guiTien(500);
        taiKhoan.inThongTin();
        taiKhoan.rutTien(400);
        taiKhoan.inThongTin();
        taiKhoan = new TaiKhoan(2222, 2700);
        taiKhoan.inThongTin();
        taiKhoan.guiTien(300);
        taiKhoan.inThongTin();
        taiKhoan.rutTien(600);
        taiKhoan.inThongTin();
    }
}
