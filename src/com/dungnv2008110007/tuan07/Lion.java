package com.dungnv2008110007.tuan07;

public class Lion extends Feline {
    protected Lion(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void phatTiengKeu() {
        System.out.println(" Sư tử gầm !!!");
    }
    @Override
    protected void an() {
        System.out.println(" Ăn thịt động vật yếu hơn");
    }
}
