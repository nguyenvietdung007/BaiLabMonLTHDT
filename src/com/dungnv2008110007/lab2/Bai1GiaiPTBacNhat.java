/*
    Lab 2 Bài 1: Viết chương trình giải PT bậc nhất trong đó
    các hệ số a và b nhập từ bàn phím.
*/
package com.dungnv2008110007.lab2;
import java.util.Scanner;
public class Bai1GiaiPTBacNhat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất: ax + b = 0");       
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: "); 
        double b = scanner.nextDouble(); 
        if(a == 0){ 
            if(b == 0){
                System.out.println("Vô số nghiệm");
            }
            else{ 
                System.out.println("Vô nghiệm");
            }
        }      
        else{
            double x = -b/a;
            System.out.printf("Nghiệm x = %.2f", x);
        }
    }
}
