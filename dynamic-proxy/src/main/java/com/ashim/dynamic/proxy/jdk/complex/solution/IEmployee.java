package com.ashim.dynamic.proxy.jdk.complex.solution;

/**
 * @author ashimjk on 3/3/2019
 */
public interface IEmployee extends IPerson {

	String getSSN();

	String getDepartment();

	Float getSalary();

	void setSSN(String ssn);

	void setDepartment(String department);

	void setSalary(String salary);

}
