package mineproject_1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankCode {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    String s = sc.nextLine();
    list.add("국민은행");
    list.add("우리은행");
    list.add("IBK국민은행");
    list.add("농협은행");
    list.add("신한은행");
    list.add("카카오뱅크");
    list.add("부산은행");
    list.add("하나은행");
    list.add("제주은행");
    list.add("KEB은행");

    for (int i = 0; i < list.size(); i++) {

    }
    if(list.get(0).equals("국민은행")){
        name1();
    } else if (list.get(1).equals("우리은행")) {

    } else if (list.get(2).equals("IBK국민은행")) {

    } else if (list.get(3).equals("농협은행")) {

    } else if (list.get(4).equals("신한은행")) {

    } else if (list.get(5).equals("카카오뱅크")) {

    } else if (list.get(6).equals("부산은행")) {

    } else if (list.get(7).equals("하나은행")) {

    } else if (list.get(8).equals("제주은행")) {

    } else if (list.get(0).equals("KEB은행")) {

    }else {
      System.out.println("입력한 정보가 없습니다.");
    }

  }

  public static void name1(){
    System.out.println("국민은행");
  }
  public static void name2(){
    System.out.println("우리은행");
  }
  public static void name3(){
    System.out.println("IBK국민은행");
  }
  public static void name4(){
    System.out.println("농협은행");
  }
  public static void name5(){
    System.out.println("신한은행");
  }
}
