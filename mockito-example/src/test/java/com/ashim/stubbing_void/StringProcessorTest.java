package com.ashim.stubbing_void;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
class StringProcessorTest {

	@Spy
	private Printer printer;

	@Test
	void internal_buffer_should_be_null_when_instantiated() throws PrinterNotConnectedException {
		// Given
		StringProcessor sp = new StringProcessor(printer);
		Mockito.doNothing().when(printer).printTestPage();

		// When
		Optional<String> actualBuffer = sp.statusAndTest();

		// Then
		assertFalse(actualBuffer.isPresent());

	}

	@Test
	void printer_not_connected_exception_should_be_throw() throws PrinterNotConnectedException {
		// Given
		StringProcessor sp = new StringProcessor(printer);
		Mockito.doThrow(new PrinterNotConnectedException()).when(printer).printTestPage();

		// Then
		Assertions.assertThrows(PrinterNotConnectedException.class, sp::statusAndTest);
	}
}
