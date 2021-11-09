package com.dungnv2008110007.tuan07;

public class Dog extends Canine {
    protected Dog(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void diLoanhQuanh() {
        System.out.println(" Đi dạo quanh nhà");
    }
    void duoiMeo(){
        System.out.println("Đuổi mèo...");
    }
    void banNang(){
        System.out.println("Liếm lông....");
    }
}
