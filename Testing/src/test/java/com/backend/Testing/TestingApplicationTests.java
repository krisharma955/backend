package com.backend.Testing;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
class TestingApplicationTests {

    @BeforeEach
    void setupConfig() {
        log.info("Setting up Config");
    }

    @AfterEach
    void testExecuted() {
        log.info("Test case successfully executed");
    }

    @BeforeAll
    static void configInit() {
        log.info("Initial Commit");
    }

    @AfterAll
    static void testEnd() {
        log.info("Final Commit");
    }

	@Test
//    @Disabled
	void testNumberOne() {
        log.info("test one is running");
	}

    @Test
//    @DisplayName("Test Case 2")
    void testNumberTwo() {
        log.info("test two is running");
    }

}