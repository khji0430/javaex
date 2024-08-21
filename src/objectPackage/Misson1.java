package objectPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Misson1 {
  public static void main(String[] args) {
    // 학생의 점수를 입력받아서 저장하고 sum과 avg를 구하라.
    // 학생의 수는 정해져 있지 않다. 더 이상 입력받지 않으려면 - 값을 입력한다..
    // (재사용성을 고려)
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();  // 인덱스 크기를 정하지 않고 내가 값을 넣을 떄 사요한다.
    int score = 0;

    while(true){
      System.out.print("정수를 입력하세요(종료시 -값입력) : ");
      score = in.nextInt();
      if(score< 0) break;
      scores.add(score);
    }

    System.out.println(scores.size());
    System.out.println(scores);

    int sum = 0;
    for (Integer iScore : scores) {
      sum += iScore;
    }
    System.out.println(sum);

    double avg  = sum / (double)scores.size();
    System.out.printf("%d 개의 점수의 합은 %d 이고, 평균평균는 %.2f 입니다.", scores.size(), sum, avg );



//    do{
//      System.out.print("정수를 입력하세요(종료시 -값입력) : ");
//      score = in.nextInt();
//      if(score >= 0){
//        scores.add(score);
//      }
//    } while(score >=0);








//
//    avg = sum / (double)prices.length;
//    System.out.println(Arrays.toString(prices));
//    System.out.printf("%d 개의 가격의 합은 %d 이고, 평균가격은 %.2f 입니다.",
//        prices.length ,sum ,avg);
  }
}
