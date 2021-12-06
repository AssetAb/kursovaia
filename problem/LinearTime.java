package kursovaia.problem;

import kursovaia.utils.ArrayUtils;

/**
 * Сызықтық уақыт есебін жүзеге асыру - <em>O(n)</em>:
 *
 * <p>
 *Массивтің барлық элементтерін қорытындылау.
 *
 *
 */
public class LinearTime implements Problem {

  @Override
  public long solve(int n) {
    int[] array = ArrayUtils.createSortedArray(n);

    long sum = 0;

    // Өлшеу кезінде параллель болмас үшін үйінді тазалаңыз
    // біздің әрекеттеріміз (біз оған кепілдік бере алмаймыз, бірақ біз тырысамыз...)
    System.gc();

    long time = System.nanoTime();
    for (int i = 0; i < n; i++) {
      sum += array[64];
    }
    time = System.nanoTime() - time;


    return time;
  }

}
