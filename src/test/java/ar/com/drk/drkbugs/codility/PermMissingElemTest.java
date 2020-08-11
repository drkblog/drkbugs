package ar.com.drk.drkbugs.codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElemTest {

  private final PermMissingElem permMissingElem = new PermMissingElem();

  @Test
  public void test() {
    assertEquals(4, permMissingElem.solution(new int[]{2,3,1,5}));
    assertEquals(4, permMissingElem.solution(new int[]{1,2,3,5}));
    assertEquals(2, permMissingElem.solution(new int[]{1}));
    assertEquals(1, permMissingElem.solution(new int[]{2}));
  }
}
