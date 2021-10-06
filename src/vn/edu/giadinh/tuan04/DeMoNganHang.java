package vn.edu.giadinh.tuan04;
import java.util.Scanner;



public class DeMoNganHang {
    static Scanner scanner=new Scanner(System.in);
    static void nhapTK(TaiKhoan tk){
        System.out.println("Nhập số tk:");
        tk.soTK(scanner.nextInt());
        scanner.nextLine();
        tk.soDu(50);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TaiKhoan a[]=null;
        int luaChon,soLuong=0;
        long s,d;
        do{
            System.out.println("----Menu----");
            System.out.println(">>1.Nhân Viên");
            System.out.println(">>2.Khách Hàng");
            luaChon = scanner.nextInt();
        
        switch (luaChon) {
            case 1:System.out.println(">>1.Nhập thông tin khách hàng");
                    System.out.println(">>2.Hiển thị danh sách khách hàng");
                    System.out.println(">>3.Hiển thị lương hàng tháng");
                    System.out.println("Nhập lựa chọn");
                    int luaChonNV=scanner.nextInt();
                    switch(luaChonNV){
                        case 1: System.out.println("Nhập số lượng khách hàng:");
                        soLuong = scanner.nextInt();
                        a =new TaiKhoan[soLuong];
                        for(int i = 0;i<soLuong;i++){
                            System.out.println("Khách hàng số:"+(i+1));
                            a[i]=new TaiKhoan();
                            nhapTK(a[i]);
                        }
                        break;
                        case 2:
                        System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
                        for( int i=0;i<soLuong;i++){
                            a[i].showData();

                        }
                        break;
                        case 3:break;
                    }

                
                break;
            case 2:
                    System.out.println(">>1.Nạp Tiền");
                    System.out.println(">>2.Gửi tiền");
                    System.out.println(">>3.Hiển thị số dư");
                    System.out.println("Nhập lựa chọn");
                    int luaChonKH=scanner.nextInt();
                    switch(luaChonKH){
                        case 1:
                                System.out.println("Nhập số tài khoản:");
                                s= scanner.nextLong();
                            for(int i =0;i<soLuong;i++){
                                d=a[i].xuatSoTK();
                            if(s==d){
                                System.out.println("Tài Khoản:"+d);
                                a[i].napTien();
                            }
                            else{
                                System.out.println("Nhập sai số tài khoản");
                            }
                        }
                        break;
                        case 2: 
                             System.out.println("Nhập số tài khoản:");
                            s= scanner.nextLong();
                        for(int i =0;i<soLuong;i++){
                            d=a[i].xuatSoTK();
                        if(s==d){
                            System.out.println("Tài Khoản:"+d);
                            a[i].rutTien();
                                 }
                        else{
                            System.out.println("Nhập sai số tài khoản");
                            }
                }
                    }
                    break;
            default:
                break;
        }
        }
        while(luaChon<=4 && luaChon>=0);

        



    }
    
}