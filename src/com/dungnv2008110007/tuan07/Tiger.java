package com.dungnv2008110007.tuan07;

public class Tiger extends Feline {
    protected Tiger(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void phatTiengKeu() {
        System.out.println("Con hổ đang gào !!!");
    }
    @Override
    protected void an() {
        System.out.println("Con hổ đang ăn !!!");
    }
}
