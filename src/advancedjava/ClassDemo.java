package advancedjava;

import exercisech7.Line;

public class ClassDemo {
  public static void main(String[] args) {
    Line line = new Line(10);
    //클래스 정보 확인
    Class aClass = line.getClass();
    System.out.println(aClass.getName());
    System.out.println(aClass.getSimpleName());
    System.out.println(aClass.getTypeName());
    System.out.println(aClass.getPackage().getName());
  }
}
