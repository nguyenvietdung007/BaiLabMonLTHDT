package com.dungnv2008110007.tuan07;

public class Feline extends Animal {
    protected Feline(String h, String l, int g, String k){
        super(h, l, g, k);
    }
    @Override
    protected void diLoanhQuanh() {
        System.out.println("Đi lang thang một mình !!!");
    }
    
}
