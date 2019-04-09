package com.ashim.stubbing_void;

import java.util.Optional;

class StringProcessor {

	private Printer printer;
	private String currentBuffer;

	StringProcessor(Printer printer) {
		this.printer = printer;
	}

	Optional<String> statusAndTest() throws PrinterNotConnectedException {
		printer.printTestPage();
		return Optional.ofNullable(currentBuffer);
	}
}
