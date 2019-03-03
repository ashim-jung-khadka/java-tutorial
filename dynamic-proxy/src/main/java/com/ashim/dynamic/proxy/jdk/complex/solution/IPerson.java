package com.ashim.dynamic.proxy.jdk.complex.solution;

/**
 * @author ashimjk on 3/3/2019
 */
public interface IPerson {

	String getName();

	String getAddress();

	String getPhoneNumber();

	void setName(String name);

	void setAddress(String address);

	void setPhoneNumber(String phoneNumber);

	String findNameAndAddress();

}
