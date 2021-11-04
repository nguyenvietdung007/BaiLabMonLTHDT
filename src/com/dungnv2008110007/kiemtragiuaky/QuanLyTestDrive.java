package com.dungnv2008110007.kiemtragiuaky;

import java.util.ArrayList;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy ds = new DanhSachQuanLy();
        HocVien hocVien = new HocVien();
        NhanVien nhanVien = new NhanVien();
        KhachHang khachHang = new KhachHang();
        hocVien.setHoTen("Nguyễn Việt Dũng");
        hocVien.setDiaChi("123 Nguyễn Oanh");
        hocVien.setDiemMH1(7);
        hocVien.setDiemMH2(9);
        nhanVien.setHoTen("Nguyễn B");
        nhanVien.setDiaChi("47 Trường Chinh");
        nhanVien.setHeSoLuong(2);
        khachHang.setHoTen("Nguyễn C");
        khachHang.setDiaChi("212 Nguyễn Trãi");
        khachHang.setTenCongTy("Phần mềm Quang Trung");
        khachHang.setTriGiaHoaDon(5);
        ds.themNguoi(hocVien);
        ds.themNguoi(nhanVien);
        ds.themNguoi(khachHang);
        ds.inDanhSach();





    }
}
