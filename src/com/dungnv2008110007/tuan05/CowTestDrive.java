package com.dungnv2008110007.tuan05;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();
        cow.inThongTin();
        cow.moo();
        cow = new Cow(7.5);
        cow.inThongTin();
        cow.moo();
        cow = new Cow(4, 1);
        cow.inThongTin();
        cow.moo();
    }

}
