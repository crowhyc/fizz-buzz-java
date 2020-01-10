package com.thoughtworks;

public class Pos {
    private int num;

    private Pos() {}

    public boolean isDivisible(int dividedNum) {
        return num % dividedNum == 0;
    }

    public String getPos() {
        return num + "";
    }

    public static Pos of(int num) {
        Pos pos = new Pos();
        pos.num = num;
        return pos;
    }
}
