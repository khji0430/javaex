package exercisech8;


public class EX1_1 {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if(c1.equals(c2)){
      System.out.println("C1과 C2는 같다.");
    } else{
      System.out.println("C1과 C2는 다르다.");
    }
  }
}


class Circle{
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }
//
//  @Override
//  public boolean equals(Object obj) {
//    Circle circle = (Circle) obj;
//
//  }
}
