package interface_package;

public class AnonymousDemo2 {
  public static void main(String[] args) {
    Parent p = new Parent() {  // 객체 몸통  -> 익명객체를 바로 만들 수 있음
      @Override                // 이름이 없어서 외부에서는 사용 불가 오직 내부에서만 사용가능
      public void callOnce() {
        System.out.println("딱 한 번만 호출됩니다.");
      }

    };
    p.callOnce();
  }
}

interface Parent {
  void callOnce();
}

//class OnlyOnce implements Parent{
//  @Override
//  public void callOnce() {
//    System.out.println("딱 한 번만 호출됩니다.");
//  }
//}
