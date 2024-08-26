package advancedjava;

import java.io.IOException;

public class ExceptionHandlingDemo {
  public static void main(String[] args) throws IllegalArgumentException{
    try {
      method1();
    } catch (IOException e) {
      System.out.println("예외가 발생했습니다.");
    } finally {  // 반드시 실행되어야 될때 사용한다.
      System.out.println("프로그램 종료");
    }
  }

  public static void method1() throws IllegalArgumentException, IOException{
    //throw new IllegalArgumentException();
    //System.out.println("예외 발생");
    //throw new IOException();

  }
}
