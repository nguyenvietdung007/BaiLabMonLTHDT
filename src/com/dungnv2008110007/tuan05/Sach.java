package com.dungnv2008110007.tuan05;

public class Sach {
    //attribute - thuộc tính
    String nhaXuatBan;
    double namXuatBan;
    double giaBan;
    String loai;
    //methood - function
    //hàm tạo mặc định
    Sach(){
        loai = "Sách Giáo Khoa";
        nhaXuatBan = "Nguyễn Việt Dũng";
        namXuatBan = 2001;
        giaBan = 35000;
    }
    //hàm tạo 1 tham số
    Sach(double a){
        loai = "Sách Chính Trị - Pháp Luật";
        nhaXuatBan = "Nguyễn Thị Trí";
        namXuatBan = 1997;
        giaBan = a;
    }
    //hàm tạo 2 tham số
    Sach(double m, double n){
        loai = "Sách Khoa Học Công Nghệ - Kinh Tế";
        nhaXuatBan = "Nguyễn Văn Ất";
        namXuatBan = m;
        giaBan = n;
    }
    void gioiThieuSach(){
        System.out.println("Loại Sách: "+loai);
        System.out.println("Nhà xuất bản: "+nhaXuatBan);
        System.out.println("Năm xuất bản: "+namXuatBan);
        System.out.println("Giá bán: "+giaBan);
    }
    double thanhTien(int soLuong){
        double tien;
        tien = soLuong*giaBan;
        return tien;
    }
}
