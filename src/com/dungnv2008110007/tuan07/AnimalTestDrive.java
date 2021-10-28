package com.dungnv2008110007.tuan07;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.tenDongVat("Sư tử");
        lion.setLoaiThucAn("thịt");
        lion.setMucDoi(5);
        lion.xuatLoaiThucAn();
        lion.phatTiengKeu();
        lion.an();
        lion.ngu();
        lion.diLoanhQuanh();
        HaMa hama = new HaMa();
        hama.tenDongVat("Hà Mã");
        hama.setLoaiThucAn("thức ăn dành cho Hà Mã");
        hama.setMucDoi(3);
        hama.xuatLoaiThucAn();
        hama.phatTiengKeu();
        hama.an();
        hama.ngu();
        hama.diLoanhQuanh();
    }
}
