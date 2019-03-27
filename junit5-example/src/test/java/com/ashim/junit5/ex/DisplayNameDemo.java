package com.ashim.junit5.ex;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
class DisplayNameDemo {

	@Test
	@DisplayName("Custom test name containing spaces")
	void testWithDisplayNameContainingSpaces() {
		System.out.println("DisplayNameDemo.testWithDisplayNameContainingSpaces");
	}

	@Test
	@DisplayName("╯°□°）╯")
	void testWithDisplayNameContainingSpecialCharacters() {
		System.out.println("DisplayNameDemo.testWithDisplayNameContainingSpecialCharacters");
	}

	@Test
	@DisplayName("😱")
	void testWithDisplayNameContainingEmoji() {
		System.out.println("DisplayNameDemo.testWithDisplayNameContainingEmoji");
	}

}