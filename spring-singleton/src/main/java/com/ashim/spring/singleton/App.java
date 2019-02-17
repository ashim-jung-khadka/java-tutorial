package com.ashim.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Singleton singleton = ctx.getBean("singleton", Singleton.class);

		System.out.println("");
		System.out.println("singleton before: " + singleton.getText());
		System.out.println("prototype before: " + singleton.getPrototype().getText());

		singleton.setText("Modified");
		singleton.getPrototype().setText("Modified");

		// 1st retrieval
		singleton = ctx.getBean("singleton", Singleton.class);
		System.out.println("");
		System.out.println("singleton after: " + singleton.getText());
		System.out.println("prototype after: " + singleton.getPrototype().getText());

		// 2st retrieval
		singleton = ctx.getBean("singleton", Singleton.class);
		System.out.println("");
		System.out.println("singleton after: " + singleton.getText());
		System.out.println("prototype after: " + singleton.getPrototype().getText());

		((ClassPathXmlApplicationContext) ctx).close();
	}

	public static void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		System.out.println("----------------Singleton-------------------");

		System.out.println("----------------1st Retrival-------------------");
		Singleton singleton = ctx.getBean("singleton", Singleton.class);
		System.out.println(singleton.getText());

		singleton.setText("Modified1");

		singleton = ctx.getBean("singleton", Singleton.class);
		System.out.println("----------------2st Retrival-------------------");
		System.out.println(singleton.getText());

		singleton.setText("Modified2");

		singleton = ctx.getBean("singleton", Singleton.class);
		System.out.println("----------------3st Retrival-------------------");
		System.out.println(singleton.getText());

		System.out.println("----------------Prototype-------------------");

		System.out.println("----------------1st Retrival-------------------");
		Prototype prototype = ctx.getBean("prototype", Prototype.class);
		System.out.println(prototype.getText());

		prototype.setText("Modified1");

		prototype = ctx.getBean("prototype", Prototype.class);
		System.out.println("----------------2st Retrival-------------------");
		System.out.println(prototype.getText());

		prototype.setText("Modified2");

		prototype = ctx.getBean("prototype", Prototype.class);
		System.out.println("----------------3st Retrival-------------------");
		System.out.println(prototype.getText());

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
