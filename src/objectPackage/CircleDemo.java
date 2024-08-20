package objectPackage;

public class CircleDemo {
  public static void main(String[] args) {
      Circle c1 = new Circle(10);  // 생성자는 stack영역, 참조자는 c1

      double area;

      int radius = c1.getRadius();
      System.out.println("원의 반지름 초기값: " + radius);

      c1.setRadius(2);
      System.out.println("원의 반지름 변경값:" + c1.getRadius());

      c1.printRadius();
      area = c1.getArea();
      System.out.println("원의 넓이: " + area);
      System.out.println("반올림한 원의 넓이 : " + Math.round(area));
  }
}
