package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();
    c.add(10);
    System.out.println(c.size());
    c.add(20);
    System.out.println(c.size());
    System.out.println(c);
    Integer[] iarray = c.toArray(new Integer[c.size()]);
    System.out.println(Arrays.toString(iarray));
    c.remove(10);
    System.out.println(c);
    boolean contains = c.contains(11);  // 찾을 수 있니
    System.out.println(contains);
    c.clear();
    System.out.println(c.size());
    System.out.println(c.isEmpty());
    System.out.println(c);
  }
}
