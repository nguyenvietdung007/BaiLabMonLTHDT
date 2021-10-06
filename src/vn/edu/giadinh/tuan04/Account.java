package vn.edu.giadinh.tuan04;

import java.util.Scanner;

public class Account {

    //attribute - thuộc tính
    String account_number;
    int account_balance;

    //method - function
    void setNumber(String  a){
        account_number = a;
    }
    void setBalance(int b){
        account_balance = b;
    }
    String getNumber(){
        return account_number;
    }
    int getBalance(){
        return account_balance;
    }
    int guiTien(int nap){
        
        if(nap > 0){
            account_balance = nap + account_balance;
            return account_balance;
        }
        else{
            System.out.println("Số tiền không hợp lệ ");

        }
        return account_balance;
    }
    void guiTienToanDS(Account mang[], int a, int nap){
        
            for(int i = 0; i < a; i++){
                mang[i] = new Account();
                mang[i].guiTien(nap);
            }
        
    }
    int rutTien(int tienRut){
        
        if(tienRut <= account_balance){
            account_balance = account_balance - tienRut;
            return account_balance;
        }else{
            System.out.println("Số tiền không hợp lệ");
        }
        
        return account_balance;
    }
    void rutTienToanDS(Account mang[], int a, int rut){
       
            for(int i = 0; i < a; i++){
                mang[i] = new Account();
                mang[i].rutTien(rut);
            }
        
    }
    void nhapDSAccount(Account mang[], int a){
        String account_number;
        int  account_balance;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < a; i++){
            mang[i] = new Account();
            System.out.print("Nhập số tài khoản: ");
            account_number = scanner.nextLine();
            mang[i].setNumber(account_number);
            System.out.print("Nhập số dư: ");
            account_balance = scanner.nextInt();
            mang[i].setBalance(account_balance);
            scanner.nextLine();
        }
    }
    void inDSTaiKhoan(Account a[], int n){
        System.out.printf("%-4s | %-13s | %s\n","STT","Số tài khoản","Số dư tài khoản");
        for(int i = 0; i < n; i++){
            System.out.printf("%d    | %-13s | %d\n", i + 1, a[i].getNumber(), a[i].getBalance());
        }
    }
}

