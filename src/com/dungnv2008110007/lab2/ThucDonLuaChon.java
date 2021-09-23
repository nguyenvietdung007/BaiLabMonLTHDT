/*
    Lab 2 Bài 4: Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài giải PT Bậc 1, 
    giải PT Bậc 2, tính tiền điện và một chức năng để thoát khỏi ứng dụng. 
*/
package com.dungnv2008110007.lab2;
import java.util.Scanner;
public class ThucDonLuaChon {
    private static int luaChon;

    public static void main(String[] args){
        int luaChon;
        do{
            System.out.println("\n------ MENU ------");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("------ END -------");

            System.out.print("Chọn chức năng: ");
            Scanner bienNhap = new Scanner(System.in);
            luaChon = bienNhap.nextInt();
            switch (luaChon)
            {
                case 1: System.out.println("--- Giải phương trình bậc nhất ---");
                        System.out.print("Nhập a: ");
                        double a = bienNhap.nextDouble();
                        System.out.print("Nhập b: ");
                        double b = bienNhap.nextDouble();
                        giaiPTBacNhat(a, b); break;
                case 2: System.out.println("--- Giải phương trình bậc hai ---");       
                        System.out.print("Nhập a: ");
                        double m = bienNhap.nextDouble();
                        System.out.print("Nhập b: ");
                        double n = bienNhap.nextDouble();
                        System.out.print("Nhập c: ");
                        double k = bienNhap.nextDouble();
                        giaiPTBacHai(m, n, k); break;
                case 3: System.out.println("--- Tính tiền điện ---");       
                        System.out.print("Nhập số điện đã sử dụng: ");
                        double soDien = bienNhap.nextDouble();
                        tinhTienDien(soDien); break;
                case 4: System.out.println("Kết thúc"); break;
                default: System.out.println("Không hợp lệ. Vui lòng chọn lại từ 1 đến 4");
            }
        }
        while (luaChon != 4);
    }

    static void giaiPTBacNhat(double a, double b){
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

    static void giaiPTBacHai(double a, double b, double c){
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

    static void tinhTienDien(double soDien){
        
        double tienDien;
        if(soDien <= 50)
        {
            tienDien = soDien*1000;
            System.out.print("Tiền điện cần trả: " + tienDien);
            System.out.println(" đồng");
        } 
        else if(soDien > 50)
        {
            tienDien = 50*1000 + (soDien - 50)*1200;
            System.out.print("Tiền điện cần trả: " + tienDien);
            System.out.println(" đồng");
        }
        else{
            System.out.println("Nhập sai vui lòng nhập lại số điện đã sử dụng");
        }
    } 
}
