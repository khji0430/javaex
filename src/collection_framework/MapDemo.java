package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {  //key, value
    Map<String, Integer> map = Map.of("딸기", 5 ,"바나나", 3, "사과", 2);
    HashMap<String, Integer> hm = new HashMap<>(map);
    System.out.println(hm.size());
    System.out.println("바나나의 개수 : " + hm.get("바나나"));
    hm.put("딸기", 10);  // 기존 키값을 가지고 벨류값을 수정
    System.out.println("딸기의 개수 : " + hm.get("딸기"));
    hm.put("수박", 5);
    System.out.println(hm.size());
    System.out.println("수박의 개수 : " + hm.get("수박"));
  }
}
