/*
    Lab 3 Bài 1: Viết chương trình nhập một số nguyên từ bàn phím 
    và cho biết số đó có phải là số nguyên tố hay không.
*/
package tuan02.Lab3;
import java.util.Scanner;
public class Bai1KTraSoNgTo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        int souoc = 0;
        for (int i = 1;i <= n;i++){
            if (n % i == 0){
                souoc++;
            }
        }if (souoc == 2){
            System.out.print("" +n);
            System.out.println(" là số nguyên tố");
        }
        else{
            System.out.print("" +n);
            System.out.println(" không phải là số nguyên tố");
        }
    } 
            
}
