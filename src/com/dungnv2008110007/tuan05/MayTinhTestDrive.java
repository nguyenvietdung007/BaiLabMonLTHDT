package com.dungnv2008110007.tuan05;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh;
        mayTinh = new MayTinh();
        mayTinh.inThongTin();
        System.out.print("Tổng tiền 2 chiếc máy tính là: "+mayTinh.tinhTien(2));
        System.out.println(" triệu đồng");
        mayTinh = new MayTinh(2018);
        mayTinh.inThongTin();
        System.out.print("Tổng tiền 3 chiếc máy tính là: "+mayTinh.tinhTien(3));
        System.out.println(" triệu đồng");
        mayTinh = new MayTinh(16, 20);
        mayTinh.inThongTin();
        System.out.print("Tổng tiền 4 chiếc máy tính là: "+mayTinh.tinhTien(4));
        System.out.println(" triệu đồng");
    }
}
