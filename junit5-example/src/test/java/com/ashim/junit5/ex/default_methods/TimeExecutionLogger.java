package com.ashim.junit5.ex.default_methods;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

@Tag("timed")
@ExtendWith(TimingExtension.class)
interface TimeExecutionLogger {

}