package advancedjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class SystemDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    LinkedList dl  = new LinkedList();

    //data가 적을 때 사용
    long before = System.nanoTime();
    for (int i = 0; i < 100; i++) {
      al.add(i);
    }
    long after = System.nanoTime();
    System.out.println("ArrayList실행시간: " + (after - before));

    //data가 많을 때 사용
    before = System.nanoTime();
    for (int i = 0; i < 100; i++) {
      dl.add(i);
    }
    after = System.nanoTime();
    System.out.println("LinkedList실행시간: " + (after - before));
  }
}
