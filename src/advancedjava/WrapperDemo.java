package advancedjava;
// 기본 타입을 참조타입으로 변환 -> 박싱
// 참조 타입으로 다시 변환한 것을 -> 언박싱
public class WrapperDemo {
  public static void main(String[] args) {
    Integer ic = 10; // 자동 박싱 // 박싱할 때 기본타입은 대문자로 시작한다.
    System.out.print(ic.getClass().getSimpleName());
    System.out.println(ic);  // 문자 10 출력
    int i = ic; // 자동 언박싱
    System.out.println(i);  // 숫자 10 출력

    Double d = 2.0;
    System.out.println(d.getClass().getSimpleName());  // 무슨 타입인지 나타낸다.
    System.out.println(d); // 문자 2.0 출력
    double o =  d;
    System.out.println(o);


//    Long lc = 1000000000L;
//    long l = lc;
//
//    Double dc = 20.0;
//    double d = dc;
  }
}
