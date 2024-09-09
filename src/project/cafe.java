package project;

import java.util.Scanner;

public class cafe {

  private static Scanner sc = new Scanner(System.in);
  // 주문 총 5개까지 가능
  private static String[] orderList = new String[5];

  public static void main(String[] args) {
    // 총 금액을 저장할 변수
    int total = 0;

    // 화면 출력 무한 반복
    while (true){
      System.out.println("☆★☆★ Cafe ☆★☆★");
      System.out.println("1. 주문하기");
      System.out.println("2. 취소하기");
      System.out.println("3. 결제하기");
      System.out.println("4. 끝내기");
      System.out.print("입력: ");

      int selectNo = sc.nextInt();

      if (selectNo == 1){
        
      }
    }
  }
}
