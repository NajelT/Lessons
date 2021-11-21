package com.tms.lesson5;

public enum POST {
    DIRECTOR(5),
    WORKER(1);
    private final int coef;

        POST(int coef){this.coef=coef;}

    public int getCoef() {
        return coef;
    }
}
