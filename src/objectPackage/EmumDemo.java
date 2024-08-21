package objectPackage;

import java.util.Stack;

public class EmumDemo {
  public static void main(String[] args) {

    System.out.println(People.Gender.FEMALE);
    System.out.println(People.Number.TWO);

    int a = 2;
    if(People.Gender.FEMALE != People.Gender.MALE){
      System.out.println("여성입니다.");
    }

  }
}

class People{ // 상수값을 묶어놓은 클래스
//  static final int MALE = 1;
//  static final int FEMALE = 2;
//  static final int ONE = 1;
//  static final int TWO = 2;

  enum Gender {MALE, FEMALE}
  enum Number {ONE, TWO}
}
