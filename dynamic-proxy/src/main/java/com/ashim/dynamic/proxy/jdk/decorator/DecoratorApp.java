package com.ashim.dynamic.proxy.jdk.decorator;

/**
 * @author ashimjk on 3/1/2019
 */
public class DecoratorApp {

	public static void main(String[] args) {

		Mobile nokia = new Nokia();
		Mobile decorator = new NormalCacheDecorator(nokia);

		System.out.println(decorator.getData());
		System.out.println(decorator.getData());

		System.out.println("-------------------------------------------");

		Mobile genericDecorator = GenericCacheDecorator.decorate(nokia, Mobile.class);
		System.out.println(genericDecorator.getData());
		System.out.println(genericDecorator.getData());
	}

}
