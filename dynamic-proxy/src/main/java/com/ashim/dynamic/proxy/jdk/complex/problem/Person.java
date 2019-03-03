package com.ashim.dynamic.proxy.jdk.complex.problem;

import com.ashim.dynamic.proxy.jdk.complex.solution.IPerson;

/**
 * @author ashimjk on 3/3/2019
 */
public class Person implements IPerson {

	private String name;
	private String address;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber =
				phoneNumber;
	}

	@Override public String findNameAndAddress() {
		return name + ":" + address;
	}
}
