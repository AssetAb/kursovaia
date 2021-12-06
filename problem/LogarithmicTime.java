package kursovaia.problem;

import kursovaia.utils.ArrayUtils;

import java.util.Arrays;

/**
 * Логарифмдік уақыт есебін орындау- <em>O(log n)</em>:
 *
 * <p>
 * Екілік іздеу арқылы сұрыпталған массив ішіндегі элементті табу.
 *
 *
 */
public class LogarithmicTime implements Problem {

  @Override
  public long solve(int n) {
    int[] array = ArrayUtils.createSortedArray(n);
    long sum = 0;

    // Өлшеу кезінде параллель болмас үшін үйінді тазалаңыз
    // біздің әрекеттеріміз (біз оған кепілдік бере алмаймыз, бірақ біз тырысамыз...)
    System.gc();

    long time = System.nanoTime();

    // Мұны 10_000 рет іске қосыңыз, осылайша біз пайдалы нәтиже аламыз
    for (int i = 0; i < 10_000; i++) {
      // Қадамдардың ең көп саны қажет екеніне көз жеткізу үшін 0-ді іздеңіз
      int position = Arrays.binarySearch(array, 0);
      sum += position;
    }

    time = System.nanoTime() - time;



    return time;
  }

}
