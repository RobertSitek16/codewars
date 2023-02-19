package wrongendhead;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WrongEndHeadTest {

    @Test
    void shouldReturnCorrectArrayPositions() {
        assertArrayEquals(new String[]{"head", "body", "tail"},
                WrongEndHead.fixTheMeerkat(new String[]{"tail", "body", "head"}));
        assertArrayEquals(new String[]{"upper legs", "torso", "lower legs"},
                WrongEndHead.fixTheMeerkat(new String[]{"lower legs", "torso", "upper legs"}));
        assertArrayEquals(new String[]{"sky", "rainbow", "ground"},
                WrongEndHead.fixTheMeerkat(new String[]{"ground", "rainbow", "sky"}));
    }
}