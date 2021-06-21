package org.simuduckapp.review;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {

    @DisplayName("Test Duck displays")
    @Test
    public void testSimpleJunitFive() {
        assertEquals("Looks like Main Duck", Duck.display());
    }

    @DisplayName("Test Duck sound quack. Multiple sources.")
    @ParameterizedTest(name = "est Duck sound quack is: {0}")
    @ValueSource(strings = {"quack zero", "quack one", "quack two"})
    public void testSoundsMultipleInputs(String sound) {
        assertEquals(sound, Duck.quack(sound));
    }
}
