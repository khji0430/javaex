package exercise_ch11;
// 데이터를 저장하는 방법
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class EX3 {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("김열공", 80);
    map.put("최고봉", 90);
    map.put("우등생", 95);
    map.put("나자바", 88);

    Scanner scanner = new Scanner(System.in);
    System.out.println("이름을 입력하세요 : ");
    String name = scanner.nextLine();
    System.out.println(map.get(name));
  }
}

//
//class Students{
//  int name;
//  int score;
//
//  public Students(int name, int score) {
//    this.name = name;
//    this.score = score;
//  }
//
//  @Override
//  public String toString() {
//    return "Student{" +
//        "name=" + name +
//        ", score=" + score +
//        '}';
//  }
//}
