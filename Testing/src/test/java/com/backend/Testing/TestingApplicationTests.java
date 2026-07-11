package com.backend.Testing;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
class TestingApplicationTests {

	@Test
	void testNumberOne() {
        int a = 5, b = 3;
        int res = add2Numbers(a, b);

        Assertions.assertEquals(8, res); //checks the expected result with evaluated result
	}

    @Test
    void testNumberTwo() {

    }

    /// Utility Methods

    int add2Numbers(int a, int b) {
        return a + b;
    }

}