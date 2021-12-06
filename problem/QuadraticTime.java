package kursovaia.problem;

import kursovaia.utils.ArrayUtils;

/**
 * Квадрат-уақыт есебінің орындалуы- <em>O(n²)</em>:
 *
 * <p>
 * Кірістіру сұрыптауымен массивді сұрыптау.
 *
 *
 */
public class QuadraticTime implements Problem {

  @Override
  public long solve(int n) {
    int[] array = ArrayUtils.createRandomArray(n);

    // Өлшеу кезінде параллель болмас үшін үйінді тазалаңыз
    // біздің операцияларымыз (біз оған кепілдік бере алмаймыз, бірақ біз тырысамыз...)
    System.gc();

    long time = System.nanoTime();
    insertionSort(array);
    time = System.nanoTime() - time;



    return time;
  }

  private void insertionSort(int[] elements) {
    for (int i = 1; i < elements.length; i++) {
      int elementToSort = elements[i];
      int j = i;
      while (j > 0 && elementToSort < elements[j - 1]) {
        elements[j] = elements[j - 1];
        j--;
      }
      elements[j] = elementToSort;
    }
  }

  @Override
  public int getMaxN() {
    // Әйтпесе операция тым ұзаққа созылады
    return 2 << 16;
  }

}
