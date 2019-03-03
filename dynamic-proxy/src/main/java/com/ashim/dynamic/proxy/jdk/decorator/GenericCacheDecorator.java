package com.ashim.dynamic.proxy.jdk.decorator;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ashimjk on 3/1/2019
 */
public class GenericCacheDecorator implements InvocationHandler {

	private Object obj;
	private Object EMPTY = new Object();
	private Map<String, Object> cacheData = new HashMap<>();

	private GenericCacheDecorator(Object obj) {
		this.obj = obj;

		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			for (PropertyDescriptor desc : beanInfo.getPropertyDescriptors()) {
				cacheData.put(desc.getReadMethod().getName(), EMPTY);
			}

		} catch (IntrospectionException ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	static <I, T extends I> I decorate(T t, Class<I> interfaceClass) {

		GenericCacheDecorator cacheablesDecorator = new GenericCacheDecorator(t);
		return (I) Proxy.newProxyInstance(interfaceClass.getClassLoader(),
				new Class[] { interfaceClass }, cacheablesDecorator);
	}

	@Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (cacheData.containsKey(method.getName())) {
			Object o = cacheData.get(method.getName());
			if (o == EMPTY) {
				Object returned = method.invoke(obj, args);
				cacheData.put(method.getName(), returned);

				return returned;
			} else {
				return o;
			}
		}

		return method.invoke(obj, args);
	}
}
