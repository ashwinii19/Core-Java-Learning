package com.techlabs.test;

public interface B {

	default void print() {
        System.out.println("B");
    }
}
