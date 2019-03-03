package com.ashim.dynamic.proxy.jdk.decorator;

/**
 * @author ashimjk on 3/1/2019
 */
public class Nokia implements Mobile {

	@Override public String getData() {
		return "Nokia - " + System.nanoTime();
	}

}
