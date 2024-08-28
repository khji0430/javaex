package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("바나나", "사과", "무화과", "블루베리", "포도"); // 수정 불가
    HashSet<String> hs = new HashSet<>(set);
    hs.add("수박");
    Iterator<String> iterator = hs.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    boolean add = hs.add("사과");
    System.out.println(add);
    System.out.println(hs.size());
  }
}
