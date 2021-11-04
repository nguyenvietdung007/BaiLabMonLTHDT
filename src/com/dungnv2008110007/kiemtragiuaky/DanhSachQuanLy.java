package com.dungnv2008110007.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList <Nguoi> danhSach = new ArrayList<>();
    public void themNguoi(Nguoi nguoi){
        danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
}
