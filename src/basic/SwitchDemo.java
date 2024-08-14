package basic;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    // 점수를 입력받아서 해당 점수의 학점을 매기는 프로그램
    // 10 ==> "A" 9 ==> "B"  8 ==> "c", 0 ~ 7 ==> "D"
    // switch 문은 정수여야 되고, 비교뮨 x, 같다 다르다
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요(1~100) : ");
    int score = in.nextInt();
    String grade = "";
    switch (score){
      case 10 :
        grade = "A";
        System.out.println(grade);
        break;
      case 9 :
        grade = "B";
        System.out.println(grade);
        break;
      case 8 :
        grade = "C";
        System.out.println(grade);
        break;
      default:
        grade = "D";
        System.out.println(grade);
    }

//    if(score == 10){
//       grade = "A";
//    } else if (score == 9) {
//      grade = "B";
//    } else if (score == 8) {
//      grade = "C";
//    } else {
//      grade = "D";
//    }
//    System.out.printf("당신의 점수는 %d 이고, 학점은 %s 입니다. ", score, grade);

    }
  }

