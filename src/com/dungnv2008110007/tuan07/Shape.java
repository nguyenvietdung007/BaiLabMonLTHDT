package com.dungnv2008110007.tuan07;

public class Shape {
    private String amThanh;
    private boolean nhapChuotChua;
    private static int soLanNhapChuot;

    protected void xoay(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ ");
    }
    private void phatAmThanh(){
        System.out.println("Âm thanh phát ra: "+getAmThanh()+"\n");
    }
    protected void setShape(String a){
        System.out.println(a);
    }
    protected void setAmThanh(String aT){
        amThanh = aT;
    }
    private String getAmThanh(){
        return amThanh;
    }
    protected void setNhapChuot(boolean n){
        if(n == true || n == false){
            nhapChuotChua = n;
        }else{
            System.out.println(" Không nhận dạng được !!!");
        }
        
    }
    private boolean getNhapChuot(){
        return nhapChuotChua;
    }
    protected void kiemTraVaXuLi(){
        if(getNhapChuot() == true){
            soLanNhapChuot++;
            System.out.println("Nhấp chuột lên hình chưa: "+getNhapChuot() + ". Đã nhấp chuột");
            System.out.println("Lần nhấp chuột thứ: "+ soLanNhapChuot);
            xoay();
            phatAmThanh();
        }
        else{
            System.out.println("Nhấp chuột lên hình chưa: "+getNhapChuot());
            System.out.println("Bạn chưa nhấp chuột lên hình !!!");
        }
    } 
}
