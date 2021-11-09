package com.dungnv2008110007.tuan07;

public class Canine extends Animal {
    protected Canine(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void diLoanhQuanh() {
        System.out.println("Đi lang thang theo bầy đàn !!!");
    }
    
}
