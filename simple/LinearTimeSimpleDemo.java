package kursovaia.simple;

/**
 * Сызықтық уақыт мәселесін өлшеуге арналған қарапайым демонстрация - <em>O(n)</em>:
 *
 * <p>
 * Массивтің барлық элементтерін қорытындылау.
 *
 *
 */
public class LinearTimeSimpleDemo {

  public static void main(String[] args) {
    for (int n = 32; n <= 512; n *= 2) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = i;
      }

      long sum = 0;

      long time = System.nanoTime();
      for (int i = 0; i < n; i++) {
        sum += array[i];
      }
      time = System.nanoTime() - time;

      System.out.printf("n = %d -> time = %d ns%n", n, time);
    }
  }

}
