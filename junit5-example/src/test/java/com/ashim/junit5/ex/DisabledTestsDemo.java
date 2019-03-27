package com.ashim.junit5.ex;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class DisabledTestsDemo {

	@Disabled("Disabled until bug #42 has been resolved")
	@Ignore
	@Test
	void testWillBeSkipped() {
	}

	@Test
	void testWillBeExecuted() {
	}

}