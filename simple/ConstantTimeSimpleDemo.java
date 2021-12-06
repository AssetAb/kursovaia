package kursovaia.simple;

import java.util.LinkedList;

/**
 * Тұрақты уақыт мәселесін өлшеуге арналған қарапайым демонстрация- <em>O(1)</em>:
 *
 * <p>
 * Байланыстырылған тізімнің басына элементтерді кірістіру.
 *
 *
 */
public class ConstantTimeSimpleDemo {

  public static void main(String[] args) {
    for (int n = 32; n <= 512; n *= 2) {
      LinkedList<Integer> list = new LinkedList<>();
      for (int i = 0; i < n; i++) {
        list.add(i);
      }

      long time = System.nanoTime();
      list.add(0, 1);
      time = System.nanoTime() - time;

      System.out.printf("n = %d -> time = %d ns%n", n, time);
    }
  }

}
