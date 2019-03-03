package com.ashim.dynamic.proxy.jdk.complex.solution;

/**
 * @author ashimjk on 3/3/2019
 */
public interface IManager extends IEmployee {

	String getTitle();

	String[] getDepartments();

	void setTitle(String title);

	void setDepartments(String[] departments);

}
