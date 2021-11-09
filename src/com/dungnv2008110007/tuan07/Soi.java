package com.dungnv2008110007.tuan07;

public class Soi extends Canine {
    protected Soi(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void phatTiengKeu() {
        System.out.println("A hu u...");
    }
    @Override
    protected void an() {
        System.out.println("Con sói đang ăn thịt con thỏ !!!");
    }
}
