package objectPackage;

import java.time.DayOfWeek;
import java.util.Scanner;

public class SwichDemo3 {
  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.println("요일을 입력하세요 : ");
//    String day = in.nextLine();
// 중복되는 것은 낙하 시킨다.

    Day dayOfWeek = Day.SUM;
    switch (Day.FRI){
      case MON :
      case TUE :
      case WED :
      case THU :
      case FRI :
        System.out.println("평일입니다.");
        break;
      case SAT :
      case SUM :
        System.out.println("주말입니다.");
        break;
      default:
        System.out.println("알 수 없는 문자가 입력되었습니다.");
    }
  }
}
