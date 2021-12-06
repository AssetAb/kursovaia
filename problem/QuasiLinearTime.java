package kursovaia.problem;

import kursovaia.utils.ArrayUtils;

import java.util.Arrays;

/**
 * Implementation of a quasi-linear-time problem - <em>O(n log n)</em>:
 *
 * <p>
 * Sorting an array with Quicksort.
 *
 *
 */
 public class QuasiLinearTime implements Problem {

  @Override
  public long solve(int n) {
    int[] array = ArrayUtils.createRandomArray(n);

      // Өлшеу кезінде параллель болмас үшін үйінді тазалаңыз
      // біздің әрекеттеріміз (біз оған кепілдік бере алмаймыз, бірақ біз тырысамыз...)
    System.gc();

    long time = System.nanoTime();
    Arrays.sort(array);
    time = System.nanoTime() - time;

      // Бүкіл операция HotSpot арқылы оңтайландырылмауы үшін


    return time;
  }

  @Override
  public int getMinN() {
      // Arrays.sort() ішінде пайдаланылған қос жиынтық жылдам сұрыптау кірістіру сұрыптауына ауысады.
      // 44 элементтен аз массивтер үшін --> 32-ден емес, 64-тен басталады!
    return 2 << 5;
  }

  @Override
  public int getMaxN() {
    // Әйтпесе операция тым ұзаққа созылады
    return 2 << 24;
  }

}
