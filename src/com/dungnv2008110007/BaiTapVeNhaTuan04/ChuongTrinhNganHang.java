package com.dungnv2008110007.BaiTapVeNhaTuan04;
import java.util.Scanner;
public class ChuongTrinhNganHang {
    public static void main(String[] args) {
        int n;
        do{
            System.out.println("====== MENU ======");
            System.out.println("1. Thông Tin Tài Khoản");
            System.out.println("2. Thông Tin Khách Hàng");
            System.out.println("3. Thông Tin Nhân Viên");
            System.out.println("4. Kết Thúc");
            System.out.println("====== END ======");
            System.out.print("Nhập lựa chọn của bạn: ");
            Scanner bienNhap = new Scanner(System.in);
            n = bienNhap.nextInt();
            switch(n){
                case 1: System.out.println("<<Bạn cần nhập thông tin tài khoản>>");
                        System.out.print("Bạn muốn nhập bao nhiêu tài khoản: ");
                        int a = bienNhap.nextInt();
                        Account mang[] = new Account[a];
                        Account taiKhoan = new Account();
                        taiKhoan.nhapDSAccount(mang, a);
                        System.out.println("Danh sách các tài khoản vừa nhập là:");
                        taiKhoan.inDSTaiKhoan(mang, a);
                        chonHanhViTK(mang, a);
                        break;
                case 2: System.out.println("<<Bạn cần nhập thông tin khách hàng>>");
                        System.out.print("Bạn muốn nhập bao nhiêu khách hàng: ");
                        int b = bienNhap.nextInt();
                        KhachHang mang1[] = new KhachHang[b];
                        nhapDSKhachHang(mang1, b);
                        System.out.println("Danh sách các khách hàng vừa nhập là:");
                        inDSKhachHang(mang1, b);
                        sapXepTheoAnphabet(mang1, b);
                        System.out.println("Danh sách khách hàng sắp xếp Họ theo Anphabet là:");
                        inDSKhachHang(mang1, b);
                        break;
                case 3: System.out.println("<<Bạn cần nhập thông tin nhân viên>>");
                        System.out.print("Bạn muốn nhập bao nhiêu nhân viên: ");
                        int c = bienNhap.nextInt();
                        NhanVien mang2[] = new NhanVien[c];
                        nhapDSNhanVien(mang2, c);
                        System.out.println("Danh sách nhân viên vừa nhập là:");
                        inDSNhanVien(mang2, c);
                        timKiemVaXoa(mang2, c);
                        System.out.println("Danh sách nhân viên:");
                        inDSNhanVien(mang2, c);
                        break;
                case 4: System.out.println("Kết thúc"); break;
                default: System.out.println("Không hợp lệ. Vui lòng chọn lại từ 1 đến 4");                
            }
        }
        while( n != 4);
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
    static void nhapDSNhanVien(NhanVien mang[], int a){
        String maNV;
        String tenNV, luong;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < a; i++){
            mang[i] = new NhanVien();
            System.out.print("Nhập tên nhân viên: ");
            tenNV = scanner.nextLine();
            mang[i].setTenNV(tenNV);
            System.out.print("Nhập mã nhân viên: ");
            maNV = scanner.nextLine();
            mang[i].setMaNV(maNV);
            System.out.print("Nhập lương nhân viên: ");
            luong = scanner.nextLine();
            mang[i].setLuong(luong);
            scanner.nextLine();
        }
    }
    static void inDSNhanVien(NhanVien a[], int n){
        System.out.printf("%-4s | %-30s | %-13s | %s\n","STT","Tên nhân viên","Mã nhân viên","Lương nhân viên");
        for(int i = 0; i < n; i++){
            System.out.printf("%d | %-30s | %-13s | %s\n", i + 1, a[i].getTenNV(), a[i].getMaNV(), a[i].getLuong());
        }
    }
    static void timKiemVaXoa(NhanVien a[], int n){
        Scanner bienNhap = new Scanner(System.in);
        String ma;
        
        System.out.print("Nhập mã nhân viên mà bạn muốn xóa: ");
        
            ma = bienNhap.nextLine();
            NhanVien tam = null;
            int i;
            for(i = 0; i < n; i++){
                a[i] = new NhanVien();
                
                if(a[i].getMaNV().equals(ma)){
                    tam = a[i];
                    break;
                }
            }
            if(tam != null){
                a[i].remove(tam);
                System.out.println("Nhân viên này đã được xóa");
            }else{
                
                System.out.printf("Nhân viên có mã %s không có trong danh sách\n",ma);
                
            }
        
    }   
}
