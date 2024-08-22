package exercise;

public class Ex1 {
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    ColoredCircle c2 = new ColoredCircle(10,"빨간색");
    c1.show();
    c2.show();
  }
}

class Circle{
    int radius;

    public Circle(int radius){
      this.radius = radius;
    }

    void show(){
    System.out.println("반지름이 " + radius + " 인 원이다.");
    }
}


class ColoredCircle extends Circle{
  String color;

  public ColoredCircle (int radius, String color){
    super(radius);  // 부모 생성자 먼저 호출한다.
    this.color = color;
  }
  void show(){
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
  }

}