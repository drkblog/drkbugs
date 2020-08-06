package ar.com.drk.drkbugs.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    private final BinaryGap binaryGap = new BinaryGap();

    @Test
    void normal() {
        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(5, binaryGap.solution(1041));
        assertEquals(2, binaryGap.solution(51712));
    }

    @Test
    void edgeCases() {
        assertEquals(0, binaryGap.solution(0));
        assertEquals(0, binaryGap.solution(0xFFFFFFFF));
    }
}