package com.ashim.dynamic.proxy.jdk.subclass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ashimjk on 3/1/2019
 */
public class CustomerHandler implements InvocationHandler {

	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("subClass");
		return null;
	}
}
