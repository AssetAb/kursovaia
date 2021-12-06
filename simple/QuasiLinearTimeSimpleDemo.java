package kursovaia.simple;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Квазисызықты уақыт есебін өлшеуге арналған қарапайым демонстрация- <em>O(n log n)</em>:
 *
 * <p>
 * Quicksort көмегімен массивді сұрыптау.
 *
 *
 */
public class QuasiLinearTimeSimpleDemo {

  public static void main(String[] args) {
    // Arrays.sort() ішінде пайдаланылған қос жиынтық жылдам сұрыптау кірістіру сұрыптауына ауысады.
    // 44 элементтен аз массивтер үшін --> 32-ден емес, 64-тен басталады!
    for (int n = 64; n <= 512; n *= 2) {
      ThreadLocalRandom random = ThreadLocalRandom.current();
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = random.nextInt();
      }

      long time = System.nanoTime();
      Arrays.sort(array);
      time = System.nanoTime() - time;

      System.out.printf("n = %d -> time = %d ns%n", n, time);
    }
  }

}
