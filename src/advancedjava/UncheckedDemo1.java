package advancedjava;

import java.util.StringTokenizer;
// 컴파일러가 코드를 잘못 짜는 것을 체크를 하지 않는다.
public class UncheckedDemo1 {
  public static void main(String[] args) {
    String s = "time is money";
    StringTokenizer st = new StringTokenizer(s);

    while(st.hasMoreElements()){
      System.out.println(st.nextElement());
    }

    // 일회성 객체라서 다시 찍어야 한다.
    st = new StringTokenizer(s);
    System.out.println(st.nextElement());
//    System.out.println(st.nextElement());
//    System.out.println(st.nextElement());
//    System.out.println(st.nextElement());

  }
}
