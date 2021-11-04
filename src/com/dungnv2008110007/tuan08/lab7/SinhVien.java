package com.dungnv2008110007.tuan08.lab7;

public abstract class SinhVien {
    //attribute
    private String ten;
    private String nganh;
    //method
    protected SinhVien(String ten, String nganh){
        this.ten = ten;
        this.nganh = nganh;
    }
    protected abstract double getDiem();
    protected String getHocLuc(){
        String hocLuc;
        if(getDiem() < 5)
            hocLuc = "Yếu";
        else if(5 <= getDiem() && getDiem() < 6.5)
            hocLuc = "Trung Bình";
        else if(6.5 <= getDiem() && getDiem() < 7.5)
            hocLuc = "Khá";
        else if(7.5 <= getDiem() && getDiem() < 9)
            hocLuc = "Giỏi";
        else   
            hocLuc = "Xuất Sắc";
        return hocLuc;
    }
    protected void xuat(){
        System.out.println("Họ tên sinh viên: "+ten);
        System.out.println("Ngành học: "+nganh);
        System.out.println("Điểm: "+getDiem());
        System.out.println("Học Lực: "+getHocLuc());
    }
}
