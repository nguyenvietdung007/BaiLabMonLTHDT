package com.dungnv2008110007.tuan08.lab7;

public class ChuNhat {
    //attribute
    private double rong;
    private double dai;
    //method
    protected ChuNhat(double rong, double dai){
        this.rong = rong;
        this.dai = dai;
    }
    protected double getChuVi(){
        return (dai+rong)*2;
    }
    protected double getDienTich(){
        return (rong*dai);
    }
    protected void xuat(){
        System.out.println("Chiều dài: "+dai);
        System.out.println("Chiều rộng: "+rong);
        System.out.println("Chu vi: "+getChuVi());
        System.out.println("Diện tích: "+getDienTich());
    }
}
