package com.ashim.dynamic.proxy.jdk.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ashimjk on 2/28/2019
 */
public class InterceptorApp {

	public static void main(String[] args) {
		List<String> list = MethodInterceptor.getProxy(new ArrayList<>(), List.class);
		list.add("one");
		list.add("two");

		System.out.println(list);

		list.remove("one");
	}
}
