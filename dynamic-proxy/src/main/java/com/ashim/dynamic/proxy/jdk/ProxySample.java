package com.ashim.dynamic.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ashimjk on 3/1/2019
 */
public class ProxySample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> ary = new ArrayList<String>();
		ary.add("Hello");
		ary.add("Proxy");
		ary.add("World!!");

		ClassLoader loader = ProxySample.class.getClassLoader();
		log("create a interface proxy");

		List<String> proxyAry = (List<String>) Proxy.newProxyInstance(loader, new Class<?>[] { List.class }, new MyInvocationHandler(ary));
		for (int i = 0; i < 4; i++) {
			log(proxyAry.get(i));
		}
	}

	static class MyInvocationHandler implements InvocationHandler {

		private List<String> ary;

		MyInvocationHandler(List<String> ary) {
			this.ary = ary;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (isFourthGet(method, args)) {
				return "Bow!!";
			}
			return method.invoke(ary, args);
		}

		private boolean isFourthGet(Method method, Object[] args) {
			return "get".equals(method.getName()) && ((Integer) args[0]) == 3;
		}
	}

	private static void log(Object msg) {
		System.out.println(msg);
	}

}
