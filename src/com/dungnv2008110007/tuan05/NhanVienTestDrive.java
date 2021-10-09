package com.dungnv2008110007.tuan05;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.inThongTin();
        System.out.println("Tiền lương làm việc 3 tháng là: "+nhanVien.tinhLuong(3));
        nhanVien = new NhanVien(12000);
        nhanVien.inThongTin();
        System.out.println("Tiền lương làm việc 4 tháng là: "+nhanVien.tinhLuong(4));
        nhanVien = new NhanVien(123456, 18000);
        nhanVien.inThongTin();
        System.out.println("Tiền lương làm việc 5 tháng là: "+nhanVien.tinhLuong(5));
    }
}
