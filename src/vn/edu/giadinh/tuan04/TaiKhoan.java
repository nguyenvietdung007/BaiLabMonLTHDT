package vn.edu.giadinh.tuan04;
import java.util.Scanner;
public class TaiKhoan {
    Scanner scanner= new Scanner(System.in);
    double soDU;
    long soTK;
 TaiKhoan(long soTK,double soDu){
     soTK = soTK;
     soDu = soDu;
         
}
public TaiKhoan() {
}
void soDu(double soDu){
      soDu = soDU;
}
double xuatSoDu(){
    return soDU;
}
void soTK(long soTK){
    soTK = soTK;
}
long xuatSoTK(){
    return soTK;
}
double napTien(){
    double nap;
    System.out.println("Nhập số tiền cần nạp:");
    nap = scanner.nextDouble();
    if(nap >=0){
        soDU= nap+soDU;
        System.out.println("Bạn vừa nạp"+soDU+"VND . Vào tài khoản");

    }
    else{
        System.out.println("Số tiền không hợp lệ ");

    }
    return nap;
    
}
double rutTien(){
    double rut;
    System.out.println("Nhập số tiền cần rút");
    rut =scanner.nextDouble();
    if(rut<=soDU){
        soDU=soDU-rut;
        System.out.println("Bạn vừa rút"+rut+"VND. Ra khỏi tài khoản");
    }
    else{
        System.out.println("Số tiền rút không khả dụng");
    }
    return rut;
}
void showData(){
    System.out.printf("Số tài khoản %ld",soTK);
    System.out.printf("Số Dư:%a",soDU);
    
}
}
