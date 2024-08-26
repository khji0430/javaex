package advancedjava;
// 기본 타입을 참조타입으로 변환 -> 박싱
// 참조 타입으로 다시 변환한 것을 -> 언박싱
public class WrapperDemo {
  public static void main(String[] args) {
    Integer ic = 10; // 자동 박싱
    System.out.print(ic.getClass().getSimpleName());
    System.out.println(ic);
    int i = ic; // 자동 언박싱
    System.out.println(i);

    Long lc = 1000000000L;
    long l = lc;

    Double dc = 20.0;
    double d = dc;
  }
}
