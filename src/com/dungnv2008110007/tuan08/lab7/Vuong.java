package com.dungnv2008110007.tuan08.lab7;

public class Vuong extends ChuNhat {
    private double canh;
    protected Vuong(double canh){
        super(canh,canh);
        this.canh = canh;
    }
    @Override
    protected void xuat() {
        System.out.println("Cạnh hình vuông: "+canh);
        System.out.println("Chu vi hình vuông: "+getChuVi());
        System.out.println("Diện tích hình vuông: "+getDienTich());
    }
}
