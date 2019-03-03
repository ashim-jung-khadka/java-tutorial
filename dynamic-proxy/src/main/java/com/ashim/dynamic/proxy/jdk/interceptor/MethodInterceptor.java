package com.ashim.dynamic.proxy.jdk.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ashimjk on 2/28/2019
 */
public class MethodInterceptor<T> implements InvocationHandler {

	private T t;

	private MethodInterceptor(T t) {
		this.t = t;
	}

	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("before method call : " + method.getName());
		Object result = method.invoke(t, args);
		System.out.println("after method call : " + method.getName());

		return result;
	}

	@SuppressWarnings("unchecked")
	static <T> T getProxy(T t, Class<? super T> interfaceType) {

		MethodInterceptor handler = new MethodInterceptor(t);
		return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(),
				new Class[] { interfaceType }, handler);
	}
}
