package com.dungnv2008110007.kiemtragiuaky;

public class Nguoi {
    private String hoTen, diaChi;
    protected void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    protected String getHoTen(){
        return hoTen;
    }
    protected void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    protected String getDiaChi(){
        return diaChi;
    }
    @Override
    public String toString() {
        return (getHoTen() + getDiaChi());
    }
}
