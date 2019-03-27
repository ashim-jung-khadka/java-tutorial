package com.ashim.junit5.ex;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

	@BeforeAll
	public static void baseTestBeforeAll() {
		System.out.println("BaseTest - BeforeAll");
	}

	@AfterAll
	public static void baseTestAfterAll() {
		System.out.println("BaseTest - AfterAll");
	}

	@BeforeEach
	public void baseTestBeforeEach() {
		System.out.println("BaseTest - BeforeEach");
	}

	@AfterEach
	public void baseTestAfterEach() {
		System.out.println("BaseTest - AfterEach");
	}

}
