package objectPackage;

public class Circle {
  // 필드 - 캡슐화 전
  // 반지름(radius)    int radius
  static final double PI = Math.PI;
  private int radius = 1;

  // 생성자 객체 생성시 자동으로 들어간다.
  // 메소드

  public Circle(int radius){
    if(radius <= 0 ){ // 0이 들어오지 못하게 할려고
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    }else {
      this.radius = radius;
    }

  }

  /**
   * 원의 반지름을 출력하는 메소드
   * 인스턴스를 생성해야 호출할 수 있는 메소드
   * 매개변수 X, 리턴값X
   */
  public void printRadius(){  //
    System.out.println("원의 반지름 초기값:" + radius);
  }

  /**
   * 원의 넓이를 구하여 반환하는 메소드
   * 매개변수X, 리턴값O (double)
   */

  public  double getArea(){
//    final double PI = 3.14;
    double area = PI * radius * radius;
    return area;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {  // 설정해준다.
    if(radius <= 0 ){ // 0이 들어오지 못하게 할려고
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    }else {
      this.radius = radius;
    }



  }
  @Override
   public String toString(){
    return "원의 반지름이 " + getRadius() + "이고, 넓이가" + getArea() + "인 원입니다.";
  }

//  @Override
//  public String toString() {
//    return "Circle{" +
//        "radius=" + radius +
//        '}';
//  }
}
