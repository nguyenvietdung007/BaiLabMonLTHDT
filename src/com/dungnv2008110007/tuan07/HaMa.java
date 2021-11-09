package com.dungnv2008110007.tuan07;

public class HaMa extends Animal {
    protected HaMa(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void phatTiengKeu() {
        System.out.println("Hà Mã đang kêu !!!");
    }
    @Override
    protected void an() {
        System.out.println("Hà Mã đang ăn !!!");
    }
}
