package com.ashim.junit5.ex.interface_contracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface ComparableContract<T extends Comparable<T>> extends Testable<T> {

	T createSmallerValue();

	@Test
	default void returnsZeroWhenComparedToItself() {
		T value = createValue();
		T smallerValue = createSmallerValue();
		assertEquals(0, value.compareTo(smallerValue));
	}

	@Test
	default void returnsPositiveNumberWhenComparedToSmallerValue() {
		T value = createValue();
		T smallerValue = createSmallerValue();
		assertTrue(value.compareTo(smallerValue) > 0);
	}

	@Test
	default void returnsNegativeNumberWhenComparedToLargerValue() {
		T value = createValue();
		T smallerValue = createSmallerValue();
		assertTrue(smallerValue.compareTo(value) < 0);
	}

}