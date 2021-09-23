/*
    Lab 2 Bài 2: Viết chương trình cho phép giải phương trình bậc hai 
    trong đó các hệ số a, b và c nhập từ bàn phím.
*/
package com.dungnv2008110007.lab2;
import java.util.Scanner;
public class Bai2GiaiPTBacHai {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<Giải phương trình bậc 2>>");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        if(a == 0){
            if(b == 0)    
            {   
                if(c == 0)
                    System.out.println("Vô số nghiệm");    
                else 
                    System.out.println("Vô nghiệm");
            }     
            else
            {   
                double x = -c/b;
                System.out.printf("Nghiệm x = %.2f", x);
            }
        }   
        else{ 
            double delta = Math.pow(b, 2) - 4*a*c;
            if(delta < 0)
                System.out.println("Phương trình vô nghiệm");
            else 
                if(delta == 0){   
                    double x = -b/(2*a);
                    System.out.printf("Phương trình có nghiệm kép: x1 = x2 = %.2f", x);
            }
            else
            {
                double canDelta = Math.sqrt(delta);
                double x1 = (-b + canDelta) / (2*a);
                double x2 = (-b - canDelta) / (2*a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.printf("Nghiệm x1: %.2f\n", x1);
                System.out.printf("Nghiệm x2: %.2f\n", x2);
            } 
        }
    }
}
