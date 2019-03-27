package com.ashim.junit5.ex.method_source;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ExternalMethodSourceDemo {

	@ParameterizedTest
	@MethodSource("com.ashim.junit5.ex.method_source.StringsProviders#tinyStrings")
	void testWithExternalMethodSource(String tinyString) {
		// test with tiny string
	}

}