/*
    Lab 1 Bài 1: Viết chương trình nhập họ và tên sinh viên, điểm trung bình từ bàn phím.
    Sau đó xuất ra màn hình dạng: <<họ và tên>><<điểm trung bình>>điểm.
*/
package tuan01.Lab1;
import java.util.Scanner;
public class Bai1XuatHoTenVaDiemTB {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        System.out.printf("%s %.2f điểm", hoTen, diemTrungBinh);
        
    }
}
