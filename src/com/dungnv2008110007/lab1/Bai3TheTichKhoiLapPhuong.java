/*
    Lab 1 Bài 3: Viết chương trình nhập từ bàn phím cạnh của một khối lập phương.
    Tính và xuất thể tích của khối lập phương.
*/
package com.dungnv2008110007.lab1;
import java.util.Scanner;
public class Bai3TheTichKhoiLapPhuong {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();
        double ketQua;
        ketQua = Math.pow(canh, 3);

        System.out.printf("Thể tích khối lập phương là: %.2f",ketQua);
    }
}
