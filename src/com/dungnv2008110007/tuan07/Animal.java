package com.dungnv2008110007.tuan07;

public class Animal {
    private String hinhAnhCuaNo;
    private String loaiThucAn;
    private int mucDoDoiBung;
    private String khuVucDiChuyen;

    
    protected Animal(String h, String l, int g, String k){
        hinhAnhCuaNo = h;
        loaiThucAn = l;
        if(g >= 0)
            mucDoDoiBung = g;
        else
            System.out.println("Không phù hợp !!!");
        khuVucDiChuyen = k;
    }
    protected void xuatThongTin(){
        System.out.println("Tên động vật: "+hinhAnhCuaNo);
        System.out.println("Loại thức ăn: "+loaiThucAn);
        System.out.println("Mức độ đói bụng: "+mucDoDoiBung);
        System.out.println("Khu vực di chuyển: "+khuVucDiChuyen);
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
