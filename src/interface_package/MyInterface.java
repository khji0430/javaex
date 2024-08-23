package interface_package;

public interface MyInterface {
  int MAX = 10;  // 상수, public static final 생략되어 있음
  void sayHello(); // 추상 메서드, public abstract 생략되어 있음
  default void sayGoodBye() {   // 갑자기 메소드가 추가되면 이렇게 설정 혹은 클래스에서 오버라이딩 해줘야 된다.
    System.out.println("상수값은 : " + getMax());
    System.out.println("Good bye");
  }

  static void method(){
    System.out.println("static method 입니다.");
  }

  private int getMax(){
    return MAX;
  }
}
