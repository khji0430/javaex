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
        menuList();
      } else if (selectNo == 2) {

      } else if (selectNo == 3) {

      }else {

      }
    }
  }
  private static void menuList(){
    System.out.println("------");
    System.out.println("커피 메뉴");
    System.out.println("------");
    System.out.print("1. 아메리카노");
    System.out.print("2. 아메리카노");
    System.out.print("3. 아메리카노");
    System.out.print("4. 아메리카노");
    System.out.print("5. 아메리카노");
    System.out.print("6. 아메리카노");
  }

}
