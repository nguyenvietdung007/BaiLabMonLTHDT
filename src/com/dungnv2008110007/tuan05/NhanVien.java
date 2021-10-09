package com.dungnv2008110007.tuan05;

public class NhanVien {
    //attribute - thuộc tính
    String tenNV;
    double maNV;
    String ngaySinh;
    String diaChi;
    String boPhan;
    double luong;
    //methood - function
    //hàm tạo mặc định
    NhanVien(){
        tenNV = "Nguyễn Việt Dũng";
        maNV = 2008110007;
        ngaySinh = "15/10/2001";
        diaChi = "(98/1 Nguyễn Văn Quá, P. Đông Hưng Thuận, Q.12, Tp.HCM";
        boPhan = "Trưởng phòng Nhân Sự";
        luong = 15000;
    }
    //hàm tạo 1 tham số
    NhanVien(double a){
        tenNV = "Nguyễn Thị Đoan Trang";
        maNV = 2008110020;
        ngaySinh = "20/04/2004";
        diaChi = "(981 Nguyễn Oanh, P. 10, Q.Gò Vấp, Tp.HCM";
        boPhan = "Nhân viên Kế Toán";
        luong = a;
    }
    //hàm tạo 2 tham số
    NhanVien(double m, double n){
        tenNV = "Nguyễn Thị Hoa";
        maNV = m;
        ngaySinh = "23/07/2000";
        diaChi = "(271 Âu Cơ, P. 04, Q.Tân Phú, Tp.HCM";
        boPhan = "Giám đốc Điều Hành";
        luong = n;
    }
    void inThongTin(){
        System.out.println("Tên nhân viên: "+tenNV);
        System.out.println("Mã nhân viên: "+maNV);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhan);
        System.out.println("Lương: "+luong);
    } 
    double tinhLuong(int thang){
        double tien;
        tien = thang*luong;
        return tien;
    }   
}

