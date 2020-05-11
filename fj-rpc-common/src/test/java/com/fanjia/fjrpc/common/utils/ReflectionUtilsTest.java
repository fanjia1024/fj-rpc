package com.fanjia.fjrpc.common.utils;

import junit.framework.TestCase;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author fanjia <fanjia1k@163.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/5/11
 */
public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
        TestClass t=ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    public void testGetPublicMethods() {
        Method[] methods =ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1,methods.length);
        String methodName=methods[0].getName();
        assertEquals("b",methodName);
    }

    public void testInvoke() {
        TestClass t=ReflectionUtils.newInstance(TestClass.class);
        Object obj=ReflectionUtils.invoke(t,ReflectionUtils.getPublicMethods(TestClass.class)[0]);
        assertEquals("b",obj);
    }
}