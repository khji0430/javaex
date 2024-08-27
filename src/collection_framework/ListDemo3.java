package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo3 {
  public static void main(String[] args) {
    List<String> sList = Arrays.asList("사자","호랑이", "곰"); // 사이즈는 바꿀 수 없지만 내용은 바꿀 수 있다.
    sList.set(2, "판다");
    System.out.println(sList);

//  sList.add("기린");

    List<String> slist2 = new ArrayList<>(sList);
    slist2.add("기린");
    System.out.println(slist2);
  }
}
