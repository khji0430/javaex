package advancedjava;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random r = new Random();
//    System.out.println(r.nextInt(100));  // 0~100사이에 값
    for (int i = 0; i < 100; i++) {
      System.out.println(r.nextInt(100));
    }
    r.setSeed(340030L);
    for (int i = 0; i < 100; i++) {
      System.out.println(r.nextInt(100));
    }
  }
}
