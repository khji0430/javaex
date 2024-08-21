package intermediatejava;

public class FigureInheritDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 3);
    double area = triangle.getArea();
    System.out.println(area);

    RectAngle rectAngle = new RectAngle(3,4);
    area = rectAngle.getArea();
    System.out.println(area);
  }
}

class  Figure{  // 부모 클래스
  private int poly;
  public double getArea(){
    return 0.0;
  }
}


class RectAngle extends Figure{
  private int poly = 4;
  private int height;
  private int width;

  public RectAngle(int width, int height) {
    this.height = height;
    this.width = width;
  }

  @Override
  public double getArea() {
    return height * width;
  }
}

class Triangle extends Figure{
  private int poly = 3;
  private int height;
  private  int width;

  public Triangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

    @Override
  public double getArea() {
    return (width * height) / (double)2;
  }








}