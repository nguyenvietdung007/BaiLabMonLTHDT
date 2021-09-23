/*
    Lab 1 Bài 4: Viết chương trình nhập các hệ số của PT Bậc 2.
    Tính delta và xuất căn delta ra màn hình.
*/    
package tuan01.Lab1;
import java.util.Scanner;
public class Bai4CanDelta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lần lượt nhập vào các hệ số của PT Bậc 2:");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4*a*c;
        double canDelta = Math.sqrt(delta);
        System.out.printf("Căn bậc hai của delta là: %.2f", canDelta);
    }
}
