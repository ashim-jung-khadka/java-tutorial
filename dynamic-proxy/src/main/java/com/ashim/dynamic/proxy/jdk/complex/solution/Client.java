package com.ashim.dynamic.proxy.jdk.complex.solution;

import com.ashim.dynamic.proxy.jdk.complex.problem.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ashimjk on 3/3/2019
 */
public class Client {

	public static void main(String[] args) {
		Map<String, Object> identity = new HashMap<>();

		Person person = new Person();
		IPerson ip = (IPerson) ViewProxy.newInstance(identity, person, new Class[] { IPerson.class });
		ip.setName("Bob Jones");

		IEmployee employee = (IEmployee) ViewProxy.newInstance(identity, person, new Class[] { IEmployee.class });
		employee.setAddress("111-11-1111");

		System.out.println(employee.findNameAndAddress());
	}

}
