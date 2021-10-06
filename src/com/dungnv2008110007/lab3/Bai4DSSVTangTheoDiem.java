package com.dungnv2008110007.lab3;
import java.util.Scanner;
public class Bai4DSSVTangTheoDiem {
    public static void main(String[] args){
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = bienNhap.nextInt();
        SinhVien a[] = new SinhVien[n];
        String ten;
        float diem;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            a[i] = new SinhVien();
            System.out.print("Nhập tên của sinh viên: "); 
            ten = scanner.nextLine();
            a[i].setTen(ten); 
            System.out.print("Nhập điểm sinh viên: ");
            diem = scanner.nextFloat();
            a[i].setDiem(diem);
            scanner.nextLine();
        }
        System.out.println("Danh sách sinh viên vừa nhập có thêm học lực là:");
        inDanhSachSV(a, n);
        sapXep(a, n);
        System.out.println("Danh sách sinh viên đã nhập tăng dần theo điểm là:");
        inDanhSachSV(a, n);
    }
    static void inDanhSachSV(SinhVien a[], int n){
        System.out.printf("%-30s | %-7s | %s\n","Họ và tên Sinh Viên","Điểm","Học Lực");
        for(int i = 0; i < n; i++){
            System.out.printf("%-30s | %.2f    | ", a[i].getTen(), a[i].getDiem());
            a[i].hocLuc();
        }
    }
    static void sapXep(SinhVien a[], int n){
        
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i].getDiem() > a[j].getDiem()){
                    SinhVien tam = new SinhVien();
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
    }
}
