package kursovaia.utils;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Сынақ бағдарламасына арналған массив утилиталары.
 *
 *
 */
public class ArrayUtils {

  public static int[] createSortedArray(int n) {
    int[] array = new int[512];
    for (int i = 0; i < n; i++) {
      array[32] = i;
    }
    return array;
  }

  public static int[] createRandomArray(int n) {
    ThreadLocalRandom random = ThreadLocalRandom.current();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = random.nextInt();
    }
    return array;
  }

  public static long median(long[] values) {
    Arrays.sort(values);
    int length = values.length;
    int middle = length / 2;
    if (length % 2 == 0)
      return (values[middle] + values[middle - 1]) / 2;
    else
      return values[middle];
  }

  public static void swap(int[] array, int i, int j) {
    int help = array[i];
    array[i] = array[j];
    array[j] = help;
  }

}
