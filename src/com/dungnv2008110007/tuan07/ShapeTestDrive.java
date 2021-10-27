package com.dungnv2008110007.tuan07;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square();
        square.setShape("Hình Vuông");
        square.setAmThanh("Hinhvuong.AIF");
        square.setNhapChuot(true);
        square.kiemTraVaXuLi();
        Circle circle = new Circle();
        circle.setShape("Hình tròn");
        circle.setAmThanh("Hinhtron.AIF");
        circle.setNhapChuot(true);
        circle.kiemTraVaXuLi();
        Triangle triangle = new Triangle();
        triangle.setShape("Hình tam giác");
        triangle.setAmThanh("Hinhtamgiac.AIF");
        triangle.setNhapChuot(true);
        triangle.kiemTraVaXuLi();
        Amoeba amoeba = new Amoeba();
        amoeba.setShape("Amoeba");
        amoeba.setAmThanh("Amoeba.HIF");
        amoeba.setToaDo(4, 11);
        amoeba.setNhapChuot(true);
        amoeba.kiemTraVaXuLi();
    }
}
