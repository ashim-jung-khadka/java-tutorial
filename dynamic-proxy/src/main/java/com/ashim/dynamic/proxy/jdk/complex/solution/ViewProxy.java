package com.ashim.dynamic.proxy.jdk.complex.solution;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author ashimjk on 3/3/2019
 */
public class ViewProxy implements InvocationHandler {

	private Map<String, Object> map;
	private Object obj;

	static Object newInstance(Map<String, Object> map, Object obj, Class[] interfaces) {
		return Proxy.newProxyInstance(ViewProxy.class.getClassLoader(),
				interfaces,
				new ViewProxy(map, obj));
	}

	private ViewProxy(Map<String, Object> map, Object obj) {
		this.map = map;
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args) {

		try {
			return m.invoke(obj, args);
		} catch (Exception e) {
			// ignore
		}

		Object result = null;
		String methodName = m.getName();

		if (methodName.startsWith("get")) {
			String name = methodName.substring(methodName.indexOf("get") + 3);
			result = map.get(name);

		} else if (methodName.startsWith("set")) {
			String name = methodName.substring(methodName.indexOf("set") + 3);
			map.put(name, args[0]);

		} else if (methodName.startsWith("is")) {
			String name = methodName.substring(methodName.indexOf("is") + 2);
			result = (map.get(name));
		}

		return result;
	}

}
