package com.ashim.dynamic.proxy.jdk.complex.problem;

/**
 * @author ashimjk on 3/3/2019
 */
public class Manager extends Employee {

	String title;
	String[] departments;

	public String getTitle() {
		return title;
	}

	public String[] getDepartments() {
		return departments;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDepartments(String[] departments) {
		this.departments =
				departments;
	}
}
