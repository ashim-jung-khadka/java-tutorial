package com.ashim.dynamic.proxy.jdk.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ashimjk on 2/28/2019
 */
public class ProductInvocationHandler implements InvocationHandler {

	@Override public Object invoke(Object proxy, Method method, Object[] args) {
		Arrays.stream(Thread.currentThread()
				.getStackTrace())
				.forEach(System.out::println);

		return null;
	}

}
