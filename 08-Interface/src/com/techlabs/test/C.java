package com.techlabs.test;

public class C  implements A, B {
    public void print() {
        A.super.print();
    }
}
