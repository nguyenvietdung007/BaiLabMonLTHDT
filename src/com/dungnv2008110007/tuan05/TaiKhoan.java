package com.dungnv2008110007.tuan05;

public class TaiKhoan {
    //attribute - thuộc tính
    String tenTK;
    int soTK;
    int soDu;
    //methood - function
    //hàm tạo mặc định
    TaiKhoan(){
        tenTK = "Nguyễn Việt Dũng";
        soTK = 1234;
        soDu = 1500;
    }
    //hàm tạo 1 tham số
    TaiKhoan(int a){
        tenTK = "Nguyễn Thị Hương";
        soTK = a;
        soDu = 1500;
    }
    //hàm tạo 2 tham số
    TaiKhoan(int a, int b){
        tenTK = "Hoàng Mỹ Lệ";
        soTK = a;
        soDu = b;
    }
    void inThongTin(){
        System.out.println("Tên chủ tài khoản: "+tenTK);
        System.out.println("Số tài khoản: "+soTK);
        System.out.println("Số dư trong tài khoản: "+soDu);
    }
    int guiTien(int gui){
        soDu = soDu + gui;
        return soDu;
    }
    int rutTien(int rut){
        soDu = soDu - rut;
        return soDu;
    }
}
