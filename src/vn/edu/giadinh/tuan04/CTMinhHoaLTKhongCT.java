package vn.edu.giadinh.tuan04;
import java.util.Scanner;
public class CTMinhHoaLTKhongCT {
    public static void main(String[] args){
        int account_number = 20;
        int account_balance = 100;
        
        guiTien(account_number, account_balance);
        
        rutTien(account_number, account_balance);
        
        rutTien(account_number, account_balance);
               
    }
    static void hienThiThongTin(int account_number, int account_balance){
        System.out.println("Account Number = "+ account_number);
        System.out.println("Account Balance = "+ account_balance);
    }
    static void guiTien(int account_number, int account_balance){
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập số tiền muốn gửi: ");
        int tienGui = bienNhap.nextInt();
        if(tienGui > 0){
            account_balance = account_balance + tienGui;
        }else{
            System.out.println("Số tiền không hợp lệ !");
        }
        hienThiThongTin(account_number, account_balance);
    }
    static void rutTien(int account_number, int account_balance){
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập số tiền muốn rút: ");
        int tienRut = bienNhap.nextInt();
        if(tienRut <= account_balance){
            account_balance = account_balance - tienRut;
        }else{
            System.out.println("Số dư không đủ. Vui lòng nhập lại !");
        }
        hienThiThongTin(account_number, account_balance);
    }

}
