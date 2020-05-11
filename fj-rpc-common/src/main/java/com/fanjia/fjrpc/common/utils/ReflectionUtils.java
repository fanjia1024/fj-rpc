package com.fanjia.fjrpc.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * description: ReflectionUtils <br>
 * date: 2020/5/11 22:09 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class ReflectionUtils {

    /**
     * <h1>根据类反射获取对象的方法</h1>
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T newInstance(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new  IllegalArgumentException(e);
        }
    }

    /**
     * <h1>获取所有的public方法</h1>
     * @param clazz
     * @return
     */
    public static Method[] getPublicMethods(Class clazz){
        Method[] methods=clazz.getDeclaredMethods();
        List<Method> methodList=new ArrayList<Method>();
        for (Method m: methods) {
            if (Modifier.isPublic(m.getModifiers())){
                methodList.add(m);
            }
        }

        return methodList.toArray(new Method[0]);

    }


    /**
     * <h1>调用方法获取返回</h1>
     * @param obj
     * @param method
     * @param args
     * @return
     */
    public static Object invoke(Object obj,Method method,Object ...args){
        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw  new IllegalStateException(e);
        }
    }


}
