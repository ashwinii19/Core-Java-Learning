package com.techlabs.reflection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.techlabs.reflection.model.Plugin;

public class PluginTest {

	public static void main(String[] args) throws Exception {
        Class<?> cls = Plugin.class;

        Constructor<?> cons = cls.getDeclaredConstructor();
        cons.setAccessible(true);
        Object obj = cons.newInstance();

        Field version = cls.getDeclaredField("version");
        version.setAccessible(true);
        version.set(obj, 3.1);

        Method execute = cls.getMethod("execute");
        execute.invoke(obj);

        System.out.println("Version: " + version.get(obj));
    }
}
