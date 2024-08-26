package interface_package;

public interface Takeable {
  // 추상 메소드 선언
  void take();
}

  // 인터페이스 상속
class Korean implements Takeable{
  //메소드 재정의 오버라이딩
  @Override
  public void take() {
    System.out.println("안녕하세요");
  }
}
  // 인터페이스 상속
class American implements Takeable{
  //메소드 재정의 오버라이딩
  @Override
  public void take() {
    System.out.println("Hello");
  }
}



