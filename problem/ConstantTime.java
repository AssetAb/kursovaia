package kursovaia.problem;

import java.util.LinkedList;

/**
 * Тұрақты уақыт мәселесін жүзеге асыру- <em>O(1)</em>:
 *
 * <p>
 * Байланыстырылған тізімнің басына элементтерді кірістіру.
 *
 *
 */
public class ConstantTime implements Problem {

  @Override
  public long solve(int n) {
    LinkedList list = createLinkedList(n);

    // Өлшеу кезінде параллель болмас үшін үйінді тазалаңыз
    // біздің әрекеттеріміз (біз оған кепілдік бере алмаймыз, бірақ біз тырысамыз...)
    System.gc();

    long time = System.nanoTime();

    // 1000 элемент қосыңыз (әйтпесе уақыт өлшеуге тым қысқа болады)
    for (int i = 0; i < 1_000; i++) {
      list.add(0, i);
    }

    return System.nanoTime() - time;
  }

  private LinkedList<Integer> createLinkedList(int n) {
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      list.add(i);
    }
    return list;
  }

  @Override
  public int getMaxN() {
    // Әйтпесе дайындық (байланыстырылған тізімді жасау) тым ұзаққа созылады
    return 2 << 22;
  }

}
