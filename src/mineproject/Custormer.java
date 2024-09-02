package mineproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Custormer {
  public static void main(String[] args) {

    List<String> map1 = (List<String>) new HashMap<>();
    map1.add("우리 은행");
    map1.add("신한 은행");
    map1.add("농협 은행");

    boolean isExit = false;

    

//    do{
//      Scanner sc = new Scanner(System.in);
//      System.out.println("계좌 번호 : " + sc.nextLine());
//      System.out.println("고객 이름 : " + sc.nextLine());
//      System.out.println("잔고 확인 : " + sc.nextInt());
//      System.out.println("비밀번호 : " + sc.nextLine());
//      System.out.println("은행 이름 : " + sc.nextLine());
//      System.out.println("주민번호 : " + sc.nextInt());
//      System.out.println("날짜 : " + sc.nextInt());
//    } while(isExit == false);


  }
}


class AccountOpen{
  // 인스턴스 변수
  private String accountNumber; // 계좌번호
  private String name;          // 고객이름
  private int balance;          // 잔고
  private String pws;           // 비밀번호
  private String bankName;      // 은행 이름
  private int idNum;            // 주민번호
  private int date;              // 날짜

  public AccountOpen(){}


  public AccountOpen(String accountNumber, String name, int balance, String pws, String bankName, int idNum, int date) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
    this.pws = pws;
    this.bankName = bankName;
    this.idNum = idNum;
    this.date = date;
  }
}
