package ar.com.drk.drkbugs.misc;

public class MissingPair {

  public static void main(final String[] args) {
    final int[] input1 = new int[]{1, 2, 2, 1, 3, 7, 6, 7, 3, 4, 6, 4, 5, 8, 5};
    System.out.println("solution is working: " + (findMissingPair(input1) == 8));
  }

  private static int findMissingPair(final int[] input) {
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
