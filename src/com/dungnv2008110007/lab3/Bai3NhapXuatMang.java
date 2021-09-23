/*
    Lab 3 Bài 3: Viết chương trình nhập mảng số nguyên từ bàn phím. 
    Sắp xếp và xuất mảng vừa nhập ra màn hình.3 
    Xuất phần tử có giá trị nhỏ nhất ra màn hình 
    Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3 
*/
package com.dungnv2008110007.lab3;
import java.util.Scanner;
public class Bai3NhapXuatMang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.printf("Nhập %d phần tử của mảng: ", n);
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        
        System.out.print("Mảng vừa nhập là: ");
        xuatMang(a, n);
        tangDan(a, n);
        System.out.print("\nMảng sau khi được sắp xếp là: ");
        xuatMang(a, n);
        timMin(a, n);
        trungBinhCong(a, n);
    }
    static void xuatMang(int a[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(" " + a[i]);
        }
    }
    static void tangDan(int a[], int n){
        int bienTam;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    bienTam = a[i];
                    a[i] = a[j];
                    a[j] = bienTam;
                }
            }
        }
    }
    static void timMin(int a[], int n){
        int min = a[0];
        for(int m = 1; m < n; m++){
            if(min > a[m]){
                min = a[m];
            }
        }
        System.out.println("\nPhần tử có giá trị nhỏ nhất trong mảng là: " + min);
    }
    static void trungBinhCong(int a[], int n){
        int tong = 0;
        int dem = 0;
        for(int k = 0; k < n; k++){
            if(a[k] % 3 == 0){
                tong += a[k];
                dem++;
            }
        }
        double tongTB = tong/dem;
        System.out.printf("Trung bình cộng các phần tử chia hết cho 3 là: %.2f", tongTB);
    }
}
