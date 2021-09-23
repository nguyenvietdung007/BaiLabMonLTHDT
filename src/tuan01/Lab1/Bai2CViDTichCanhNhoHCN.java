/*
    Lab 1 Bài 2: Viết chương trình nhậ­p từ bàn phím 2 cạnh của hình chữ nhật.
    Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.
*/
package tuan01.Lab1;
import java.util.Scanner;
public class Bai2CViDTichCanhNhoHCN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();
        double chuVi = (chieuDai + chieuRong)*2;
        System.out.printf("Chu vi của hình chữ nhật là: %.2f", chuVi);
        double dienTich = chieuDai*chieuRong;
        System.out.printf("\nDiện tích của hình chữ nhật là: %.2f", dienTich);
        double canhNho = Math.min(chieuDai, chieuRong);
        System.out.println("\nCạnh nhỏ của hình chữ nhật là: " + canhNho);
    }
}
