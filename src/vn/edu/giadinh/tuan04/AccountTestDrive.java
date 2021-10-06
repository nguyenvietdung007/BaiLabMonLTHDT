package vn.edu.giadinh.tuan04;
import java.util.Scanner;
public class AccountTestDrive {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in); 
        Account taiKhoan = new Account();
        System.out.println("<<Bạn cần nhập thông tin tài khoản>>");
        System.out.print("Bạn muốn nhập bao nhiêu tài khoản: ");
        int a = bienNhap.nextInt();
        Account mang[] = new Account[a];
        taiKhoan.nhapDSAccount(mang, a);
        System.out.println("Danh sách các tài khoản vừa nhập là:");
        taiKhoan.inDSTaiKhoan(mang, a);
        chonHanhViTK(mang, a);
    }
    
    static void chonHanhViTK(Account mang[], int a){
        Account taiKhoan = new Account();
        int n;
        do{
            System.out.println("==== MENU ====");
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Hiển thị số tài khoản và số dư");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            Scanner bienNhap = new Scanner(System.in);
            n = bienNhap.nextInt();
            switch(n){
                case 1: kieuGuiTien(mang, a); break;
                case 2: kieuRutTien(mang, a); break;
                case 3: taiKhoan.inDSTaiKhoan(mang, a); break;
                case 4: System.out.println("Thoát"); break;
                default: System.out.println("Không hợp lệ. Vui lòng chọn lại từ 1 đến 4");
            }
        }
        while( n != 4);
    }
    static void kieuGuiTien(Account mang[], int a){
        int n;
        do{
            System.out.println("==== MENU ====");
            System.out.println("1. Gửi tiền vào một tài khoản");
            System.out.println("2. Gửi tiền vào tất cả tài khoản");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            Scanner bienNhap = new Scanner(System.in);
            n = bienNhap.nextInt();
            switch(n){
                case 1: System.out.print("Nhập số tài khoản mà bạn muốn gửi tiền vào: ");
                        String soTK = bienNhap.nextLine();
                        timKiemVaGuiTien(mang, a, soTK);
                        break;
                case 2: System.out.print("Nhập số tiền bạn muốn gửi: ");
                        int tienVao = bienNhap.nextInt();
                        Account taiKhoan = new Account();
                        taiKhoan.guiTienToanDS(mang, a, tienVao);
                        System.out.println("Gửi tiền thành công");
                        System.out.println("Danh sách tất cả tài khoản sau khi gửi tiền là:");
                        taiKhoan.inDSTaiKhoan(mang, a);
                        break;
                case 3: System.out.println("Thoát");  break;
                default: System.out.println("Không hợp lệ. Vui lòng chọn lại từ 1 đến 3");      
            }
        }
        while( n != 3 );
    }
    static void timKiemVaGuiTien(Account mang[], int a, String soTK){
        Scanner bienNhap = new Scanner(System.in);
        int i;
        for(i = 0; i < a; i++){
            mang[i] = new Account();
            if(mang[i].getNumber() == soTK){
                System.out.print("Nhập số tiền bạn muốn gửi: ");
                int tienVao = bienNhap.nextInt();
                mang[i].guiTien(tienVao);
                System.out.println("Gửi tiền thành công");
                System.out.println("Số dư trong tài khoản là: "+mang[i].getBalance());
                break;
            }
        }
        if(mang[i].getNumber() != soTK){
            System.out.println("Không tồn tại số tài khoản này");
        }
    }
    static void kieuRutTien(Account mang[], int a){
        Account taiKhoan = new Account();
        int n;
        do{
            System.out.println("==== MENU ====");
            System.out.println("1. Rút tiền từ một tài khoản");
            System.out.println("2. Rút tiền tất cả các tài khoản");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            Scanner bienNhap = new Scanner(System.in);
            n = bienNhap.nextInt();
            switch(n){
                case 1: String soTK;
                        int i;
                        System.out.print("Nhập số tài khoản mà bạn muốn rút tiền: ");
                        do{
                            soTK = bienNhap.nextLine();
                            for(i = 0; i < a; i++){
                                mang[i] = new Account();
                                if(mang[i].getNumber() == soTK){
                                    break;
                                }
                                if( i == a){
                                    System.out.println("Không tồn tại số tài khoản này");
                                    System.out.print("Nhập lại số tài khoản có trong danh sách: ");
                                }else{
                                    mang[i] = new Account();
                                    System.out.print("Nhập số tiền bạn muốn rút: ");
                                    int tienRa = bienNhap.nextInt();
                                    mang[i].rutTien(tienRa);
                                    System.out.println("Rút tiền thành công");
                                    System.out.println("Số dư trong tài khoản là: "+mang[i].getBalance());
                                }
                            } 
                        }
                        while(i == a);
                        break;
                case 2: System.out.print("Nhập số tiền bạn muốn rút: ");
                        int tienRa = bienNhap.nextInt();
                        for(int k = 0; k < a; k++){
                            mang[k] = new Account();
                            mang[k].rutTien(tienRa);
                        }
                        System.out.println("Rút tiền thành công");
                        System.out.println("Danh sách tất cả tài khoản sau khi rút tiền là:");
                        taiKhoan.inDSTaiKhoan(mang, a);
                        break;
                case 3: System.out.println("Thoát");  break;
                default: System.out.println("Không hợp lệ. Vui lòng chọn lại từ 1 đến 3");      
            }
        }
        while( n != 3 );
    }
}
