package com.dungnv2008110007.tuan07;

public class Cat extends Animal {
    @Override
    protected void phatTiengKeu() {
        System.out.println("Mèo...meo...");
    }
    @Override
    protected void an() {
        System.out.println("Con mèo đang ăn !!!");
    }
    void duoiBat(){
        System.out.println("Đuổi bắt chuột...");
    }
}
