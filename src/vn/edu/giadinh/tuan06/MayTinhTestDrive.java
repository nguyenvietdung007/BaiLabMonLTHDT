package vn.edu.giadinh.tuan06;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        int t1 = mt.tong(5, 7);
        int t2 = mt.tong(5, 7, 9);
        System.out.println("T1: "+t1);
        System.out.println("T2: "+t2);
    }
}
