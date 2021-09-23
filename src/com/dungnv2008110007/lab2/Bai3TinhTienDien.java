/*
    Lab 2 Bài 3: Viết chương trình nhập vào số điện sử dụng 
    của tháng và tính tiền điện theo phương pháp lũy tiến. 
*/
package com.dungnv2008110007.lab2;
import java.util.Scanner;
public class Bai3TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện đã sử dụng: ");
        double soDien = scanner.nextDouble();

        if(soDien <= 50)
        {
            double tienDien = soDien*1000;
            System.out.print("Tiền điện cần trả: " + tienDien);
            System.out.println(" đồng");
        } 
        else if(soDien > 50)
        {
            double tienDienCoVuotMuc = 50*1000 + (soDien - 50)*1200;
            System.out.print("Tiền điện cần trả: " + tienDienCoVuotMuc);
            System.out.println(" đồng");
        }
        else 
            System.out.println("Nhập sai vui lòng nhập lại số điện đã sử dụng");
    }
}
