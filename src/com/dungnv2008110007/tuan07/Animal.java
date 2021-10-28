package com.dungnv2008110007.tuan07;

public class Animal {
    protected String hinhAnhCuaNo;
    protected String loaiThucAn;
    protected int mucDoDoiBung;
    protected String khuVucDiChuyen;

    protected void setLoaiThucAn(String l){
        loaiThucAn = l;
    }
    private String getThucAn(){
        return loaiThucAn;
    }
    protected void setMucDoi(int g){
        if(g >= 0)
            mucDoDoiBung = g;
        else
            System.out.println("Không phù hợp !!!");
    }
    protected void tenDongVat(String d){
        System.out.println(d);
    }
    protected void xuatLoaiThucAn(){
        System.out.println("Loại thức ăn: "+getThucAn());
    }
    protected void phatTiengKeu(){
        System.out.println("Gâu..gâu..gâu..");
    }
    protected void an(){
        System.out.println("Ăn đồ thừa !!!");
    }
    protected void ngu(){
        System.out.println("Z...z...Z...z...");
    }
    protected void diLoanhQuanh(){
        System.out.println("Đi lang thang !!!");
    }
}
