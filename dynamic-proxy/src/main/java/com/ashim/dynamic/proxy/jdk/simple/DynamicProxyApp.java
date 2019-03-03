package com.ashim.dynamic.proxy.jdk.simple;

import java.lang.reflect.Proxy;

public class DynamicProxyApp {

	public static void main(String[] args) {

		ProductInvocationHandler handler = new ProductInvocationHandler();

		Product product = (Product) Proxy.newProxyInstance(DynamicProxyApp.class.getClassLoader(),
				new Class[] { Product.class },
				handler);

		product.doSomething();
	}

}
