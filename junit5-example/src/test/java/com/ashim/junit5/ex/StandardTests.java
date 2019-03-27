package com.ashim.junit5.ex;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class StandardTests {

	@BeforeAll
	static void initAll() {
		System.out.println("StandardTests.initAll");
	}

	@BeforeEach
	void init() {
		System.out.println("StandardTests.init");
	}

	@Test
	void succeedingTest() {
		System.out.println("StandardTests.succeedingTest");
	}

	@Test
	void failingTest() {
		fail("a failing test");
	}

	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() {
		System.out.println("StandardTests.skippedTest");
	}

	@Test
	void abortedTest() {
		assumeTrue("abc".contains("Z"));
		fail("test should have been aborted");
	}

	@AfterEach
	void tearDown() {
		System.out.println("StandardTests.tearDown");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("StandardTests.tearDownAll");
	}

}