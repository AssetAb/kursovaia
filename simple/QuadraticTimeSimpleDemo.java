package kursovaia.simple;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Квадрат заңының есебін өлшеуге арналған қарапайым демонстрация - <em>O(n²)</em>:
 *
 * <p>
 * Жиымды Кірістіру сұрыптауымен сұрыптау.
 *
 *
 */
public class QuadraticTimeSimpleDemo {

  public static void main(String[] args) {
    for (int n = 32; n <= 512; n *= 2) {
      ThreadLocalRandom random = ThreadLocalRandom.current();
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = random.nextInt();
      }

      long time = System.nanoTime();
      insertionSort(array);
      time = System.nanoTime() - time;

      System.out.printf("n = %d -> time = %d ns%n", n, time);
    }
  }

  private static void insertionSort(int[] elements) {
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

}
