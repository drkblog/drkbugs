package ar.com.drk.drkbugs.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    private final CountDiv countDiv = new CountDiv();

    @Test
    public void test() {
        assertEquals(3, countDiv.solution(6, 11, 2));
        assertEquals(20, countDiv.solution(11, 345, 17));
    }
    @Test
    public void extreme() {
        assertEquals(1, countDiv.solution(0, 0, 11));
        assertEquals(0, countDiv.solution(1, 1, 11));
        assertEquals(Integer.MIN_VALUE, countDiv.solution(0, Integer.MAX_VALUE, 1));
        assertEquals(1, countDiv.solution(1, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}