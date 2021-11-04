package com.dungnv2008110007.kiemtragiuaky;

public class NhanVien extends Nguoi {
    private float heSoLuong;
    protected void setHeSoLuong(float a){
        if(1 <= a)
            heSoLuong = a;
        else 
            System.out.println("Hệ số lương ko hợp lệ");
    }
    protected float getHeSoLuong(){
        return heSoLuong;
    }
    protected float tinhLuong(){
        float luong;
        luong = heSoLuong * 1500000;
        return luong;
    }
    @Override
    public String toString() {
        String s;
        s = "Hệ số lương: "+getHeSoLuong()+" Lương: "+tinhLuong();
        return s;
    }
}
