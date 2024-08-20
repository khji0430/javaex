package objectPackage;

public class ArrayDemo2 {
  public static void main(String[] args) {

    int[] scores = new int[]{10, 20, 30, 40, 50};
    for (int i = 0; i < scores.length; i++) {
      System.out.print(scores[i] + ",");

    }
    System.out.println("");

    scores = new int[10];  // 선언과 초기화를 따로 한다.
    for (int i = 0; i < scores.length ; i++) {
      scores[i] = i + 1;
      System.out.print(scores[i] + ",");

    }

    int[] scores2 = {10, 20, 30, 40, 50, 60};   // 선언과 초기화를 한번에 한다.
  }
}
