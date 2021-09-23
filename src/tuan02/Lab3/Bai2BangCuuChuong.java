/*
    Lab 3 Bài 2: Viết chương trình xuất ra màn hình bảng cửu chương.
*/
package tuan02.Lab3;

public class Bai2BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("====== Bảng cửu chương =======");
        for(int i = 1; i <= 10; i++){
            System.out.printf("\n--------BẢNG NHÂN %d--------\n", i);
            for(int j = 0; j < 10; j++){
                System.out.printf("\t%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
