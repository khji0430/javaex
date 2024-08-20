package objectPackage;

import java.util.Arrays;
import java.util.Scanner;

public class WithArrayDemo {
  public static void main(String[] args) {
    // 배열 scores , 4개의 int score를 저장


    Scanner in = new Scanner(System.in);


    long[] prices = new long[5];
    long sum = 0L;


    for (int i = 0; i < prices.length; i++) {
      System.out.print("휴대폰 가격을 입력하세요 : ");
      prices[i] = in.nextLong();
      sum += prices[i];

    }
    System.out.println("총 합: " + sum);

    System.out.println(Arrays.toString(prices));
    double avg = sum / (double)prices.length;
    System.out.printf("%d 개의 가격의 합은 %d 이고, 평균은 %.2f점 입니다.", prices.length, sum, avg);








//    System.out.println(scores[0]);
//    System.out.println(scores[1]);
//    System.out.println(scores[2]);
//    System.out.println(scores[3]);



  }
}
