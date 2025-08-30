package com.techlabs.reflection.test;

import java.lang.reflect.Method;

import com.techlabs.reflection.model.MathUtil;

public class MathUtilTest {

	public static void main(String[] args) throws Exception {
        MathUtil obj = new MathUtil();

        Method method = MathUtil.class.getDeclaredMethod("square", int.class);
        method.setAccessible(true);
        Object result = method.invoke(obj, 5);

        System.out.println("Result: " + result); 
    }
}
