package com.dungnv2008110007.tuan07;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion", "thịt động vật khác", 5, "cả khu rừng");
        lion.xuatThongTin();
        lion.phatTiengKeu();
        lion.an();
        lion.ngu();
        lion.diLoanhQuanh();
        Tiger tiger = new Tiger("Tiger", "thịt", 4, "nửa khu rừng");
        tiger.xuatThongTin();
        tiger.phatTiengKeu();
        tiger.an();
        tiger.ngu();
        tiger.diLoanhQuanh();
        Cat cat = new Cat("Cat", "thức ăn của mèo", 2, "khắp nhà");
        cat.xuatThongTin();
        cat.phatTiengKeu();
        cat.an();
        cat.ngu();
        cat.diLoanhQuanh();
        cat.duoiBat();
        Soi soi = new Soi("Wolf", "thức ăn của sói", 3, "bán kính 500m");
        soi.xuatThongTin();
        soi.phatTiengKeu();
        soi.an();
        soi.ngu();
        soi.diLoanhQuanh();
        Dog dog = new Dog("Dog", "đồ ăn thừa", 6, "khắp nhà và vườn");
        dog.xuatThongTin();
        dog.phatTiengKeu();
        dog.an();
        dog.ngu();
        dog.diLoanhQuanh();
        dog.duoiMeo();
        dog.banNang();
        HaMa haMa = new HaMa("Hippo", "thức ăn của Hà Mã", 1, "bán kính 200m");
        haMa.xuatThongTin();
        haMa.phatTiengKeu();
        haMa.an();
        haMa.ngu();
        haMa.diLoanhQuanh();
    }
}
