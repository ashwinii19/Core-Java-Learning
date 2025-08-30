package com.techlabs.reflection.test;

import java.lang.reflect.Method;

import com.techlabs.reflection.model.HiddenOps;

public class HiddenOpsTest {

	public static void main(String[] args) throws Exception {
		HiddenOps obj = new HiddenOps();

		Method method = HiddenOps.class.getDeclaredMethod("secretCode", String.class);
		method.setAccessible(true); 
		Object result = method.invoke(obj, "hello");

		System.out.println("Output: " + result); 
	}

}
