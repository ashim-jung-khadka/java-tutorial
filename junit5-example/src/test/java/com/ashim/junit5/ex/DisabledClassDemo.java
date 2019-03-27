package com.ashim.junit5.ex;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Disabled until bug #99 has been fixed")
class DisabledClassDemo {

	@Test
	void testWillBeSkipped() {
		System.out.println("will be skipped");
	}

}