package ar.com.drk.drkbugs.misc;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImmutableListPerformance {
  public static void main(final String[] args) {
    final Random random = new Random(System.currentTimeMillis());
    final int[] sizes = random.ints(100000, 0, 1000).toArray();
    final List<List<Integer>> arrayLists = createArrayLists(sizes);
    final List<List<Integer>> immutableLists = createImmutableLists(sizes);
    System.out.println("Lists created. Start testing...");
    test(arrayLists, "ArrayList");
    test(immutableLists, "ImmutableList");
  }

  private static void test(final List<List<Integer>> arrayLists, final String name) {
    final long start = System.currentTimeMillis();
    for (int i = 0; i < 5000; i++) {
      arrayLists.forEach(list -> list.size());
    }
    final long end = System.currentTimeMillis();
    final long duration = end - start;
    System.out.println(name + " total: " + (duration) + "ms");
  }

  private static List<List<Integer>> createArrayLists(final int[] sizes) {
    final Random random = new Random(System.currentTimeMillis());
    final List<List<Integer>> lists = new ArrayList<>();
    for (final int size : sizes) {
      final List<Integer> list = new ArrayList<>();
      random.ints(size).forEach(value -> list.add(value));
      lists.add(list);
    }
    return lists;
  }

  private static List<List<Integer>> createImmutableLists(final int[] sizes) {
    final Random random = new Random(System.currentTimeMillis());
    final List<List<Integer>> lists = new ArrayList<>();
    for (final int size : sizes) {
      final ImmutableList.Builder<Integer> builder = ImmutableList.builder();
      random.ints(size).forEach(value -> builder.add(value));
      lists.add(builder.build());
    }
    return lists;
  }
}
