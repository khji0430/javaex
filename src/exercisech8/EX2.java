package exercisech8;

public class EX2 {
  public static void main(String[] args) {

    System.out.println(new Student("깁삿갓"));
    System.out.println(new Student("홍길동"));

  }
}

class Student {
  String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "학생[" +
          name +
        ']';
  }
}
