package com.dungnv2008110007.kiemtragiuaky;

public class HocVien extends Nguoi {
    private float diemMonHoc1, diemMonHoc2;
    private static int soLuongHV;
    protected void setDiemMH1(float a){
        if(0 <= a && a <= 10){
            diemMonHoc1 = a;
        }
        else 
            System.out.println("Điểm không hợp lệ");
    }
    protected float getDiemMH1(){
        return diemMonHoc1;
    }
    protected void setDiemMH2(float b){
        if(0 <= b && b <= 10){
            diemMonHoc2 = b;
        }
        else 
            System.out.println("Điểm không hợp lệ");
    }
    protected float getDiemMH2(){
        return diemMonHoc2;
    }
    protected float diemTB(){
        return (diemMonHoc1 + diemMonHoc2)/2;
    }
    @Override
    public String toString() {
        String s;
        s = "Điểm môn học 1: "+getDiemMH1()+"Điểm môn học 2: "+getDiemMH2()+"Điểm trung bình: "+diemTB();
        return s;
    }
}
