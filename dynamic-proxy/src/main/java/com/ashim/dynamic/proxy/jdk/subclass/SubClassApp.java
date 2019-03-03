package com.ashim.dynamic.proxy.jdk.subclass;

import java.lang.reflect.Proxy;

/**
 * @author ashimjk on 3/1/2019
 */
public class SubClassApp {

	public static void main(String[] args) {
		CustomerHandler handler = new CustomerHandler();
		Customer customer = (Customer) Proxy.newProxyInstance(Customer.class.getClassLoader(), new Class[] { Customer.class }, handler);

		customer.getName();
	}
}
