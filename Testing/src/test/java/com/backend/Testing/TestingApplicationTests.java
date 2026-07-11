package com.backend.Testing;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@Slf4j
class TestingApplicationTests {

	@Test
	void testNumberOne() {
        int a = 5, b = 3;
        int res = add2Numbers(a, b);

        assertThat(res)
                .isEqualTo(8)
                .isCloseTo(9, Offset.offset(1));
	}

    @Test
    void testNumberTwo() {
        assertThat("apple")
                .isEqualTo("apple")
                .startsWith("app")
                .endsWith("le")
                .hasSize(5);
    }

    @Test
    void testDivideTwoNumbers_whenDenominatorIsZero_ThenArithmeticException() { //exception checking
        int a = 5, b = 0;

        assertThatThrownBy(() -> divide2Numbers(a, b))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Tried to divide by Zero");
    }

    /// Utility Methods

    int add2Numbers(int a, int b) {
        return a + b;
    }

    int divide2Numbers(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            log.error("Arithmetic Exception occurred: {}", e.getLocalizedMessage());
            throw new ArithmeticException("Tried to divide by Zero");
        }
    }

}