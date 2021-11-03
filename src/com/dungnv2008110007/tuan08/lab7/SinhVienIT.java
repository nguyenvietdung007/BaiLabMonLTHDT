package com.dungnv2008110007.tuan08.lab7;

public class SinhVienIT extends SinhVien {
    private double diemJava;
    private double diemHtml;
    private double diemCss;
    protected SinhVienIT(String ten, double diemJava, double diemHtml, double diemCss){
        super(ten, "IT");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }
}
