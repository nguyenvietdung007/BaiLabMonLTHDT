package com.dungnv2008110007.tuan05;
import java.util.Scanner;
public class CowChoMangTestDrive {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String tenThem;
        double canNangThem;
        double tuoiThem;
        double tuoiXoa;
        
        System.out.print("Bạn muốn nhập bao nhiêu con bò: ");
        int n = bienNhap.nextInt();
        CowChoMang cow[] = new CowChoMang[n];
        nhapDSCow(cow, n);
        inDSCow(cow, n);
        sapXepTangTheoTuoi(cow, n);
        System.out.println("Danh sách bò tăng dần theo tuổi là:");
        inDSCow(cow, n);
        CowChoMang tam = new CowChoMang();
        System.out.print("Nhập tên loài bò muốn thêm: ");
        tenThem = sc.nextLine();
        tam.setTen(tenThem);
        System.out.print("Nhập cân nặng của bò muốn thêm: ");
        canNangThem = bienNhap.nextDouble();
        tam.setWeight(canNangThem);
        System.out.print("Nhập tuổi của bò muốn thêm: ");
        tuoiThem = bienNhap.nextDouble();
        tam.setAge(tuoiThem);
        
        cow = themPhanTu(cow, tam, n);
        System.out.println("Danh sách bò sau khi thêm là:");
        inDSCow(cow, n+1);
        System.out.print("Nhập tuổi của con bò có trong danh sách mà bạn muốn xóa: ");
        tuoiXoa = sc.nextDouble();
        int m = n+1;
        int i, c;
        for(c = i = 0; i < m; i++){
            if(cow[i].getAge() != tuoiXoa){
                cow[c] = cow[i];
                c++;
            }
        }
        m = c;
        System.out.println("Danh sách bò sau khi xóa là:");
        inDSCow(cow, m);
    }
    static void nhapDSCow(CowChoMang mang[], int a){
        String m;
        double n, k;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < a; i++){
            mang[i] = new CowChoMang();
            System.out.print("Nhập tên loài bò: ");
            m = scanner.nextLine();
            mang[i].setTen(m);
            System.out.print("Nhập cân nặng của bò: ");
            n = scanner.nextDouble();
            mang[i].setWeight(n);
            System.out.print("Nhập tuổi của bò: ");
            k = scanner.nextDouble();
            mang[i].setAge(k);
            scanner.nextLine();
        }
    }
    static void inDSCow(CowChoMang a[], int n){
       
        for(int i = 0; i < n; i++){
            System.out.print("STT: "+(i + 1));
            System.out.print("  Tên loài bò: "+a[i].getTen());
            System.out.print("  Cân nặng của bò: "+a[i].getWeight());
            System.out.println("  Tuổi của bò: "+a[i].getAge());
        }
    }
    static void sapXepTangTheoTuoi(CowChoMang a[], int n){
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i].getAge() > a[j].getAge()){
                    CowChoMang tam = new CowChoMang();
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
    }
    static CowChoMang[] themPhanTu(CowChoMang[] a, CowChoMang tamThoi, int n){
        int c = n - 1;
        int d = n;
        CowChoMang[] tamA = new CowChoMang[d + 1];
        boolean kiemTra = false;
        for (int i = d; i >= 0; i--){
            if(c > -1 && a[c].getAge() > tamThoi.getAge()){
                tamA[i] = a[c--];
            }else{
                if(!kiemTra){
                    tamA[i] = tamThoi;
                   
                    kiemTra = true;
                }else{
                    tamA[i] = a[c--];
                }
            }
        }
        return tamA;
    }
    static void xoaPhanTu(CowChoMang a[], double tuoiTam, int n){
        int i, c;
        for(c = i = 0; i < n; i++){
            if(a[i].getAge() != tuoiTam){
                a[c] = a[i];
                c++;
            }
        }
        
    }
}
