package vn.edu.giadinh.tuan04;
import java.util.Scanner;
public class NhanVienTestDrive {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("<<Bạn cần nhập thông tin nhân viên>>");
        System.out.print("Bạn muốn nhập bao nhiêu nhân viên: ");
        int c = bienNhap.nextInt();
        NhanVien mang2[] = new NhanVien[c];
        nhapDSNhanVien(mang2, c);
        System.out.println("Danh sách nhân viên vừa nhập là:");
        inDSNhanVien(mang2, c);
        timKiemVaXoa(mang2, c);
        System.out.println("Danh sách nhân viên:");
        inDSNhanVien(mang2, c);
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
