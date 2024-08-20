package objectPackage;

import java.util.Arrays;

public class CircleArrayDemo {
  public static void main(String[] args) {
    // Circle을 원소로 가지는 배열 Circles를 생성하라.
    // 첫번쨰와 두번째 원소만 원의 반지름이 각각 3,4 가 되도록 circle 객체를 생성하라.
    // 객체가 생성되어 있을 경우에만, 원의 넓이를 구하여 출력하라.


    Circle[] circles = new Circle[5];
    circles[0] = new Circle(3);
    circles[1] = new Circle(4);

    System.out.println(Arrays.toString(circles));

    for (Circle circle : circles) {
      if (circle != null) {
//        System.out.printf("원의 반지름이 %d이고, 넓이가 %.2f인 원입니다. \n", circle.getRadius(), circle.getArea());
        System.out.println(circle);
      }
    }





  }
}
