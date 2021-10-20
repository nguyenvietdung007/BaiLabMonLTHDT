package com.dungnv2008110007.tuan06;

public class SquareTestDrive {
    public static void main(String[] args) {
        Square square;
        square = new Square(true, 10, "tinh tong tinh tong...");
        if(square.nhapChuotChua == true){
            square.xoay(360);
            square.phatAmThanh();
        }
        else
            System.out.println("Bạn chưa nhấp chuột lên Square");
    }
}
