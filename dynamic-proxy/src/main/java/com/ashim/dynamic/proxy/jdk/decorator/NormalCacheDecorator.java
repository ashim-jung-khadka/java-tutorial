package com.ashim.dynamic.proxy.jdk.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashimjk on 3/1/2019
 */
public class NormalCacheDecorator implements Mobile {

	private Mobile mobile;
	private Map<String, Object> cacheData = new HashMap<>();

	public NormalCacheDecorator(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override public String getData() {
		Object data = cacheData.get("getData");
		if (data == null) {
			data = mobile.getData();
			cacheData.put("getData", data);
		}

		return (String) data;
	}
}
