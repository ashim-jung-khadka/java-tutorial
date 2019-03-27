package com.ashim.junit5.ex.default_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

class TestLifecycleLoggerImpl implements TestLifecycleLogger {

	@Test
	void testing(TestReporter testReporter) {

		testReporter.publishEntry("Its working");
	}

	@Test
	void testing2(TestReporter testReporter) {

		testReporter.publishEntry("Its working too");
	}

}
