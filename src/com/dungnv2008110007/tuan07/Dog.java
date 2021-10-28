package com.dungnv2008110007.tuan07;

public class Dog extends Animal {
    @Override
    protected void diLoanhQuanh() {
        System.out.println(" Đi dạo quanh nhà");
    }
    void duoiBat(){
        System.out.println("Đuổi mèo...");
    }
    void banNang(){
        System.out.println("Liếm lông....");
    }
}
