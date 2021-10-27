package vn.edu.giadinh.tuan07;

public class Amoeba {
    String amThanh;
    int x, y;
    Amoeba(String a, int m, int n){
        amThanh = a;
        x = m;
        y = n;
    }
    void xoay(){
        System.out.println("Hình xoay theo tọa độ x = "+x+" và y = "+y);
    }
    void phatAmThanh(){
        System.out.println("Phát ra file âm thanh: "+ amThanh);
    }
}
