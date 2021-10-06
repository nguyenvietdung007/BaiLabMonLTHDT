package com.dungnv2008110007.BaiTapVeNhaTuan04;

public class KhachHang {
    //attribute - thuộc tính
    String maSo;
    String ten;
    String diaChi;

    //method - function
    void setMaSoKH(String a){
        maSo = a;
    }
    void setTenKH(String b){
        ten = b;
    }
    void setDiaChiKH(String c){
        diaChi = c;
    }
    String getMaSoKH(){
        return maSo;
    }
    String getTenKH(){
        return ten;
    }
    String getDiaChiKH(){       
        return diaChi;
    }
}
