package com.dungnv2008110007.BaiTapVeNhaTuan04;
import java.util.Scanner;
public class KhachHangTestDrive {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("<<Bạn cần nhập thông tin khách hàng>>");
        System.out.print("Bạn muốn nhập bao nhiêu khách hàng: ");
        int b = bienNhap.nextInt();
        KhachHang mang1[] = new KhachHang[b];
        nhapDSKhachHang(mang1, b);
        System.out.println("Danh sách các khách hàng vừa nhập là:");
        inDSKhachHang(mang1, b);
        sapXepTheoAnphabet(mang1, b);
        System.out.println("Danh sách khách hàng sắp xếp Họ theo Anphabet là:");
        inDSKhachHang(mang1, b);
    }
    static void nhapDSKhachHang(KhachHang mang[], int a){
        String maSo;
        String ten, diaChi;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < a; i++){
            mang[i] = new KhachHang();
            System.out.print("Nhập tên khách hàng: ");
            ten = scanner.nextLine();
            mang[i].setTenKH(ten);
            System.out.print("Nhập mã khách hàng: ");
            maSo = scanner.nextLine();
            mang[i].setMaSoKH(maSo);
            System.out.print("Nhập địa chỉ khách hàng: ");
            diaChi = scanner.nextLine();
            mang[i].setDiaChiKH(diaChi);
            scanner.nextLine();
        }
    }
    static void inDSKhachHang(KhachHang a[], int n){
        System.out.printf("%-4s | %-30s | %-13s | %s\n","STT","Tên khách hàng","Mã khách hàng","Địa chỉ khách hàng");
        for(int i = 0; i < n; i++){
            System.out.printf("%d | %-30s | %-13s | %s\n", i + 1, a[i].getTenKH(), a[i].getMaSoKH(), a[i].getDiaChiKH());
        }
    }
    static void sapXepTheoAnphabet(KhachHang a[], int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i].getTenKH().compareTo(a[j].getTenKH()) > 0){
                    KhachHang tam = new KhachHang();
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
    } 
}
