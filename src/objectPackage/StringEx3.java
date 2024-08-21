package objectPackage;

import java.util.Scanner;

public class StringEx3 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String s = "";

    while (true) {    //ctrl + alt + t
      System.out.print("URL을 입력하세요 : ");
      s = in.nextLine();
//      String s = "www.Java.com";
      String sLow = s.toLowerCase(); // 소문자 대문자 구분 안한다.
      if(sLow.equals("bye")) break;
      if(sLow.contains("java")){
        System.out.println("java를 포함합니다.");
      }
      if(sLow.endsWith("com")){
        System.out.println("com으로 끝납니다.");
      }


      System.out.println(s.contains("java")); // 포함한다.
      System.out.println(sLow.endsWith("com"));
    }


  }
}
