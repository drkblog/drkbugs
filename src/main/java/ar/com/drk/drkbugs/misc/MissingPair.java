package ar.com.drk.drkbugs.misc;

public class MissingPair {

  public static void main(final String[] args) {
    final int[] input1 = new int[]{1, 2, 2, 1, 3, 7, 6, 7, 3, 4, 6, 4, 5, 8, 5};
    System.out.println("solution is working: " + (findMissingPairN2(input1) == 8));
  }

  private static int findMissingPair(final int[] input) {
    int maxValue = 0;
    for (final int k : input) {
      if (k > maxValue) {
        maxValue = k;
      }
    }
    final boolean[] flags = new boolean[maxValue + 1];
    for (final int j : input) {
      flags[j] = !flags[j];
    }
    for (int i = 0; i < flags.length; i++) {
      if (flags[i]) {
        return i;
      }
    }
    return 0;
  }

  private static int findMissingPairN2(final int[] input) {
    for (int i = 0; i < input.length; i++) {
      boolean found = false;
      for (int j = 0; j < input.length; j++) {
        if (i != j && input[i] == input[j]) {
          found = true;
          break;
        }
      }
      if (!found) {
        return input[i];
      }
    }
    return 0;
  }
}
