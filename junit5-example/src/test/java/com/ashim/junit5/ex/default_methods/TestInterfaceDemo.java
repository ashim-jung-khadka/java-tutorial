package com.ashim.junit5.ex.default_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestInterfaceDemo implements TestLifecycleLogger,
		TimeExecutionLogger, TestInterfaceDynamicTestsDemo {

	@Test
	void isEqualValue() {
		assertEquals(1, "a".length(), "is always equal");
	}

	@Override
	public boolean isPalindrome(String text) {
		return true;
	}

}