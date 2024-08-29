package exercise_ch11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Example1 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", 30),
        new Member("신용권", 40),
        new Member("감자바", 26)
    );

    OptionalDouble average = list.stream()
        .mapToInt(n -> n.getAge())
            .average();


    System.out.println("평균 나이: " + average);

  }
}

class Member{
  private String name;
  private int age;

  public Member(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName() {return name;}
  public int getAge(){return age;}
}
