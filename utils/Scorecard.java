package kursovaia.utils;

import java.util.*;

/**
 * Белгілі бір үшін өлшенген ең жылдам және медиан уақыттарын басып шығаруға арналған көрсеткіштер жүйесі
 * algorithm and problem size.
 *
 *
 */
public class Scorecard {

  private final String name;
  private final ArrayList<Long> times = new ArrayList<>();

  private long fastest = Long.MAX_VALUE;

  public Scorecard(String name) {
    this.name = name;
  }

  /**
   * Көрсеткіштер жүйесіне уақыт қосады.
   *
   * @param time бул уакыт
   */
  public void add(long time) {
    times.add(time);
    if (time < fastest) {
      fastest = time;
    }
  }

  /**
   * Ең жылдам және орташа уақыттарды басып шығарады.
   */
  public void printResult() {
    System.out.printf(Locale.US, "%s -> fastest: %,13d ns, median: %,13d ns%n",
          name,fastest, getMedian());
  }

  private long getMedian() {
    int len = times.size();
    long[] array = new long[len];
    for (int i = 0; i < len; i++) {
      array[i] = times.get(i);
    }
    return ArrayUtils.median(array);
  }

}
