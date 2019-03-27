package com.ashim.junit5.ex.method_source;

import java.util.stream.Stream;

class StringsProviders {

	static Stream<String> tinyStrings() {
		return Stream.of(".", "oo", "OOO");
	}

}