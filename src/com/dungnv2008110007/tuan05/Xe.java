package com.dungnv2008110007.tuan05;

public class Xe {
    //attribute - thuộc tính
    String ten;
    String dong;
    String hang;
    float dtxl;
    float dtXang;
    //methood - function
    //hàm tạo mặc định
    Xe(){
        ten = "Nguyễn Việt Dũng";
        dong = "Scooter – Underbone (Vario 125)";
        hang = "Honda";
        dtxl = 125;
        dtXang = 5.5F;
    }
    //hàm tạo 1 tham số
    Xe(float a){
        ten = "Nguyễn Văn Hùng";
        dong = "Underbone (Sonic 150)";
        hang = "Honda";
        dtxl = 150;
        dtXang = a;
    }
    //hàm tạo 2 tham số
    Xe(float a, float b){
        ten = "Nguyễn Văn Hùng";
        dong = "Sport Bike (R1)";
        hang = "Yamaha";
        dtxl = a;
        dtXang = b;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: "+ten);
        System.out.println("Dòng xe: "+dong);
        System.out.println("Hãng xe: "+hang);
        System.out.print("Dung tích xi lanh: "+dtxl);
        System.out.println("cc");
        System.out.print("Dung tích bình xăng: "+dtXang);
        System.out.println(" lít");
    }
}
