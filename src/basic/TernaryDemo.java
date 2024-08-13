package basic;

import java.util.Scanner;

// 삼항 연산자
public class TernaryDemo {
  public static void main(String[] args) {

//    int i = 2;
//    int res = i % 2;
//    String name = "";
//
////    if(res == 0){
////      name = "짝수";
////    }else {
////      name = "홀수";
////    }
//
//    name = (res == 0) ? "짝수" : "홀수" ;
//
//    // x값을 입력을 받아서
//
//    System.out.printf("%d 는 %s 입니다.", i, name);

// x값을 입력받는다. x 가 0보다 크거나 같으면 양수입니다.
// 0보다 작으면 음수입니다. 출력하도록 조건연산자를 이용해서 작성하시오


    Scanner in = new Scanner(System.in);
    System.out.print("x값을 입력하시오 : ");

    int i = in.nextInt();
    String res = "";

    res = (i>=0) ? "양수" : "음수";

    System.out.printf("입력한 숫자는 %d 이며, %s 입니다.", i, res);
  }
}
